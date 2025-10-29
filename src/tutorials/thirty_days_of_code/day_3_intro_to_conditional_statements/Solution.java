package tutorials.thirty_days_of_code.day_3_intro_to_conditional_statements;

// Problem name: Day 3: Intro to Conditional Statements
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-conditional-statements/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // my code starts
        isWeird(N);
        // my code ends

        bufferedReader.close();
    }

    public static void isWeird(int n) {
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
