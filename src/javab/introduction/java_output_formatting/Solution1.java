package javab.introduction.java_output_formatting;

// Problem name: Java Output Formatting
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }

}
