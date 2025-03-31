package javab.introduction.java_output_formatting;

// Problem name: Java Output Formatting
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = "";
            int x = 0;

            do {
                s1 = sc.next();
            } while (s1.length() > 10);

            do {
                x = sc.nextInt();
            } while (x < 0 || x > 999);

            String first = s1;
            for (int j = first.length(); j < 15; j++) {
                first = first.concat(" ");
            }

            String second = String.valueOf(x);
            for (int j = second.length(); j < 3; j++) {
                second = 0 + second;
            }

            System.out.println(first + second);
        }
        System.out.println("================================");

    }

}
