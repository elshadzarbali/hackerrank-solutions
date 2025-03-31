package javab.strings.java_substring;

// Problem name: Java Substring
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-substring/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        System.out.println(S.substring(start, end));
    }

}
