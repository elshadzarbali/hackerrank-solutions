package javab.strings.java_strings_introduction;

// Problem name: Java Strings Introduction
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String upperA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String upperB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(upperA + " " + upperB);
    }

}
