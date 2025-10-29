import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadMeGenerator {
    private static final String ROOT_DIR = "src";
    private static final String README_FILE = "README.md";
    private static final Pattern PROBLEM_NAME_PATTERN = Pattern.compile("^\\s*(?:--|//)\\s*Problem name:\\s*(.*)$", Pattern.CASE_INSENSITIVE);
    private static final Pattern DIFFICULTY_PATTERN = Pattern.compile("^\\s*(?:--|//)\\s*Difficulty:\\s*(.*)$", Pattern.CASE_INSENSITIVE);
    private static final Pattern URL_PATTERN = Pattern.compile("https://www\\.hackerrank\\.com/challenges/\\S*");
    private static final String DEFAULT_PROBLEM_DIFFICULTY = "Unknown";
    private static final String DEFAULT_PROBLEM_NAME = "Unknown";
    private static final String DEFAULT_PROBLEM_URL = "https://www.hackerrank.com/";

    public static void main(String[] args) {
        try {
            generateReadMe();
            System.out.println("README.md has been generated successfully!");
        } catch (IOException e) {
            System.err.println("Error generating README: " + e.getMessage());
        }
    }

    private static void generateReadMe() throws IOException {
        StringBuilder readmeContent = new StringBuilder();
        readmeContent.append("# 🎯 HackerRank Solutions\n\n");
        readmeContent.append("This repository contains my solutions to various **HackerRank** problems, "
                + "categorized by topic. All solutions are written in **Java**.\n\n");
        readmeContent.append("---\n\n");
        readmeContent.append("## 📚 Solutions List\n\n");
        readmeContent.append("---\n\n");

        File root = new File(ROOT_DIR);
        if (!root.exists() || !root.isDirectory()) {
            throw new IOException("Source directory not found: " + ROOT_DIR);
        }

        File[] categories = root.listFiles(File::isDirectory);
        if (categories != null) {
            Arrays.sort(categories);
            for (File category : categories) {
                if (category.getName().equals("javab")) {
                    readmeContent.append("### ").append("Java\n");
                } else {
                    readmeContent.append("### ").append(capitalize(category.getName())).append("\n\n");
                }

                File[] subcategories = category.listFiles(File::isDirectory);
                if (subcategories != null) {
                    Arrays.sort(subcategories);
                    for (File subcategory : subcategories) {
                        File[] problemFolders = subcategory.listFiles(File::isDirectory);
                        if (problemFolders != null) {
                            Arrays.sort(problemFolders);
                            readmeContent
                                    .append("<details>\n  <summary><b>")
                                    .append(capitalize(subcategory.getName())).append("</b></summary>\n\n");
                            readmeContent.append("| Problem Name | Difficulty | My Solution Link |\n");
                            readmeContent.append("|--------------|--------------|--------------|\n");
                            for (File problemFolder : problemFolders) {

                                File[] solutionFiles = problemFolder.listFiles(
                                        (dir, name) -> (name.endsWith(".java") || name.endsWith(".sql"))
                                );

                                if (solutionFiles != null && solutionFiles.length > 0) {
                                    Arrays.sort(solutionFiles);
                                    List<String> classNames = new ArrayList<>();

                                    String problemName = DEFAULT_PROBLEM_NAME;
                                    String diffulty = DEFAULT_PROBLEM_DIFFICULTY;
                                    String problemUrl = DEFAULT_PROBLEM_URL;

                                    for (File solutionFile : solutionFiles) {
                                        Map<String, String> problemDetails = extractProblemDetails(solutionFile);

                                        problemName = problemDetails.getOrDefault(
                                                "name", capitalize(problemFolder.getName())
                                        );
                                        diffulty = problemDetails.getOrDefault("difficulty", diffulty);
                                        problemUrl = problemDetails.getOrDefault("url", problemUrl);

                                        String solutionPath = solutionFile.getPath().replace("\\", "/");
                                        classNames.add("✔ [" + solutionFile.getName() + "](" + solutionPath + ")");
                                    }

                                    readmeContent
                                            .append("| [").append(problemName).append("](")
                                            .append(problemUrl).append(") | ")
                                            .append(diffulty).append(" | ")
                                            .append(String.join("<br>", classNames)).append(" |\n");
                                }
                            }
                            readmeContent.append("</details>\n\n");
                        }
                    }
                }
                readmeContent.append("---\n\n");
            }
        }

        Files.write(Paths.get(README_FILE), readmeContent.toString().getBytes());
    }

    private static Map<String, String> extractProblemDetails(File solutionFile) {
        Map<String, String> problemDetails = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(solutionFile))) {
            String line;
            int flag = 0;
            while ((line = reader.readLine()) != null && flag < 3) {
                // 1) Match problem name in // or -- comments
                Matcher nameMatcher = PROBLEM_NAME_PATTERN.matcher(line);
                if (nameMatcher.find()) {
                    String name = nameMatcher.group(1).trim();
                    if (!name.isEmpty() && !problemDetails.containsKey("name")) {
                        problemDetails.put("name", name);
                        flag++;
                        continue;
                    }
                }

                // 2) Match difficulty in // or -- comments
                Matcher diffMatcher = DIFFICULTY_PATTERN.matcher(line);
                if (diffMatcher.find()) {
                    String difficulty = diffMatcher.group(1).trim();
                    if (!difficulty.isEmpty() && !problemDetails.containsKey("difficulty")) {
                        problemDetails.put("difficulty", difficulty);
                        flag++;
                        continue;
                    }
                }

                // 3) Try to find URL anywhere in the line (works for commented or non-commented lines)
                Matcher urlMatcher = URL_PATTERN.matcher(line);
                if (urlMatcher.find() && !problemDetails.containsKey("url")) {
                    problemDetails.put("url", urlMatcher.group());
                    flag++;
                }
            }
            if (problemDetails.isEmpty()) {
                System.err.println("No metadata found in file: " + solutionFile.getPath());
            }
        } catch (IOException e) {
            System.err.println("Error reading " + solutionFile.getPath() + ": " + e.getMessage());
        }
        return problemDetails;
    }

    private static String capitalize(String str) {
        return Arrays.stream(str.replace('_', ' ').split(" "))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
