package javab.strings.java_strings_introduction;

// Problem name: Java Strings Introduction
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        for (int i = 0; i < Math.min(A.length(), B.length()); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (A.charAt(i) > B.charAt(i)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            } else if (i == Math.min(A.length(), B.length()) - 1) {
                if (A.length() - B.length() <= 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }

        String upperA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String upperB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(upperA + " " + upperB);
    }

}
