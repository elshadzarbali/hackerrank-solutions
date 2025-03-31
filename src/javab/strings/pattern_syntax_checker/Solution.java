package javab.strings.pattern_syntax_checker;

// Problem name: Pattern Syntax Checker
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }

}
