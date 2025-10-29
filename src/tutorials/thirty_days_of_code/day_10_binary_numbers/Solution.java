package tutorials.thirty_days_of_code.day_10_binary_numbers;

// Problem name: Day 10: Binary Numbers
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // my code starts
        System.out.println(findMaxOne(n));
        // my code ends

        bufferedReader.close();
    }

    public static int findMaxOne(int n) {
        int num = 0, maxNum = 0;
        while (n != 0) {
            if (n % 2 == 1) num++;
            else num = 0;

            if (num > maxNum) maxNum = num;
            n /= 2;
        }
        return maxNum;
    }
}
