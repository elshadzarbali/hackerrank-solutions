// Problem: https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");

                // My solution:
                double maxShort = Math.pow(2, 15) - 1;
                if (x >= -1 * (maxShort + 1) && x <= maxShort) {
                    System.out.println("* short");
                }

                double maxInt = Math.pow(2, 31) - 1;
                if (x >= -1 * (maxInt + 1) && x <= maxInt) {
                    System.out.println("* int");
                }

                double maxLong = Math.pow(2, 63) - 1;
                if (x >= -1 * (maxLong + 1) && x <= maxLong) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}