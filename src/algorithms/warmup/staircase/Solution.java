package algorithms.warmup.staircase;

// Problem name: Staircase
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/staircase/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    public static void staircase(int n) {
        // my code starts
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // my code ends
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }

}