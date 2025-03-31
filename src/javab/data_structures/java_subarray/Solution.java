package javab.data_structures.java_subarray;

// Problem name: Java Subarray
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }

}
