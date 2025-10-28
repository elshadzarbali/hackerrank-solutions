package algorithms.implementation.breaking_the_records;

// Problem name: Breaking the Records
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // my code starts
        int worstCount = 0, bestCount = 0;
        int worstRecord = scores.get(0), bestRecord = scores.get(0);

        for (int score : scores) {
            if (score > bestRecord) {
                bestCount++;
                bestRecord = score;
            } else if (score < worstRecord) {
                worstCount++;
                worstRecord = score;
            }
        }

        return Arrays.asList(bestCount, worstCount);
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
