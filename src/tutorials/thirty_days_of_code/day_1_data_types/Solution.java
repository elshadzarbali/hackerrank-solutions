package tutorials.thirty_days_of_code.day_1_data_types;

// Problem name: Day 1: Data Types
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-data-types/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int ii, i;
        i = 4;
        double dd, d;
        d = 4.0;
        String ss, s, a;
        s = "HackerRank";
        ii = input.nextInt();
        dd = input.nextDouble();
        input.nextLine();
        ss = input.nextLine();
        System.out.println(i + ii);
        System.out.println(d + dd);
        System.out.println(s + " " + ss);
    }
}
