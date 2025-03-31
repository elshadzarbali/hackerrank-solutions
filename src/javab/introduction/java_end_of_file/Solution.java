package javab.introduction.java_end_of_file;

// Problem name: Java End-of-file
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1;
        while(scan.hasNext()) {
            System.out.println(number++ + " " + scan.nextLine());
        }
    }

}
