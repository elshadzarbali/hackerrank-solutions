package algorithms.warmup.solve_me_first;

// Problem name: Solve Me First
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/solve-me-first/problem

import java.util.Scanner;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}