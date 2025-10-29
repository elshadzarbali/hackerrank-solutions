package tutorials.thirty_days_of_code.day_5_loops;

// Problem name: Day 5: Loops
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-loops/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // my code starts
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        // my code ends
    }
}
