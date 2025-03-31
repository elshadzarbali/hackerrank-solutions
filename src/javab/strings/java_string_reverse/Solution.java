package javab.strings.java_string_reverse;

// Problem name: Java String Reverse
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        boolean isPalindrome = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 -i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Yes" : "No");
    }

}
