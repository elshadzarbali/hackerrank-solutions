package javab.strings.java_substring_comparisons;

// Problem name: Java Substring Comparisons
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        if (k > 0 && k <= s.length()) {
            String[] arr = new String[s.length() + 1 - k];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.substring(i, i + k);
            }

            smallest = arr[0];
            largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (smallest.compareTo(arr[i]) > 0) {
                    smallest = arr[i];
                } else if (largest.compareTo(arr[i]) < 0) {
                    largest = arr[i];
                }
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
