package javab.strings.java_string_reverse;

// Problem name: Java String Reverse
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        String reverse = new StringBuilder(A).reverse().toString();

        System.out.println((reverse.equals(A) ? "Yes" : "No"));

    }

}
