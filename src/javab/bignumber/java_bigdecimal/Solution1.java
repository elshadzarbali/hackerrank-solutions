package javab.bignumber.java_bigdecimal;

// Problem name: Java BigDecimal
// Difficulty: Medium
// Problem link: https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // my code starts
        for (int i = 0; i < n; i++) {
            BigDecimal max = new BigDecimal(s[i]);
            int index = i;
            for (int j = i + 1; j < n; j++) {
                BigDecimal curr = new BigDecimal(s[j]);
                if (curr.compareTo(max) == 1) {
                    max = curr;
                    index = j;
                }
            }
            if (index != i) {
                String temp = s[i];
                s[i] = s[index];
                s[index] = temp;
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
