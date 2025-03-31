package javab.data_structures.java_1d_array2;

// Problem name: Java 1D Array (Part 2)
// Difficulty: Medium
// Problem link: https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int index = 0;

        return canWinHelper(leap, index, game);
    }

    public static boolean canWinHelper(int leap, int index, int[] game) {
        if (index >= game.length) return true;
        if (index < 0 || game[index] == 1) return false;

        game[index] = 1;

        return canWinHelper(leap, index + leap, game)
                || canWinHelper(leap, index + 1, game)
                || canWinHelper(leap, index - 1, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
