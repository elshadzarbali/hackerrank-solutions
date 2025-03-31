package javab.bignumber.java_bigdecimal;

// Problem name: Java BigDecimal
// Difficulty: Medium
// Problem link: https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

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
        for (int i = 1; i < n; i++) {
            BigDecimal bigDecimal = new BigDecimal(s[i]);
            int comp = bigDecimal.compareTo(new BigDecimal(s[i - 1]));
            if (comp > 0) {
                String temp = s[i];
                s[i] = s[i - 1];
                s[i - 1] = temp;
                i = 0;
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
