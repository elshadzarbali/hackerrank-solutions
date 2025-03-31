package javab.strings.java_anagrams;

// Problem name: Java Anagrams
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
