package javab.strings.java_regex;

// Problem name: Java Regex
// Difficulty: Medium
// Problem link: https://www.hackerrank.com/challenges/java-regex/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}

// My solution:
class MyRegex {
    String pattern =
            "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})" +
                    "[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})" +
                    "[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})" +
                    "[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})$";

    // ^ - start of line
    // 25[0-5] - from 250 to 255
    // 2[0-4][0-9] - from 200 to 249
    // [0-1]?[0-9]{1,2} - from 0 to 199, [0-1]? means [0-1] is optional
    // | - or
    // $ - end of line
}

