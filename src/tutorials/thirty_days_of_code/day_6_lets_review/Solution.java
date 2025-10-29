package tutorials.thirty_days_of_code.day_6_lets_review;

// Problem name: Day 6: Let's Review
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-review-loop/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // my code starts
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String evens = "";
            String odds = "";

            String s = sc.nextLine();

            for (int n = 0; n < s.length(); n++) {
                if (n % 2 == 0) {
                    evens += s.charAt(n);
                } else {
                    odds += s.charAt(n);
                }
            }

            System.out.println(evens + " " + odds);
            t--;
        }

        sc.close();
        // my code ends
    }
}
