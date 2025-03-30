package javab.introduction.java_stdin_and_stdout_2;

// Problem name: Java Stdin and Stdout II
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
