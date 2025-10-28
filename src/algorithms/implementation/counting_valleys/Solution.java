package algorithms.implementation.counting_valleys;

// Problem name: Counting Valleys
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/counting-valleys/problem

import java.io.*;

class Result {

    public static int countingValleys(int steps, String path) {
        // my code starts
        int level = 0, valley = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                level--;
            } else {
                level++;
                if (level == 0) valley++;
            }
        }

        return valley;
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
