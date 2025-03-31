package javab.data_structures.java_1d_array;

// Problem name: Java 1D Array
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // my code starts
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }
        // my code ends

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
