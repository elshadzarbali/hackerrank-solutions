package javab.strings.java_string_tokens;

// Problem name: Java String Tokens
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().isEmpty() || s.length() > 400000) {
            System.out.println("0");
        } else {
            String[] arr = s.trim().split("[ !,?._'@]+");
            System.out.println(arr.length);
            for (String str : arr) {
                System.out.println(str);
            }
        }
        scan.close();
    }

}
