package tutorials.thirty_days_of_code.day_9_recursion_3;

// Problem name: Day 9: Recursion 3
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-recursion/problem

import java.io.*;

class Result {

    public static int factorial(int n) {
        // my code starts
        if (n == 1) return 1;
        return n * factorial(n - 1);
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
