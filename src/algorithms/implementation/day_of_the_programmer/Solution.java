package algorithms.implementation.day_of_the_programmer;

// Problem name: Day of the Programmer
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.io.*;

class Result {

    public static String dayOfProgrammer(int year) {
        // my code starts
        int dayInEightMonth = 243; // 31, 28, 31, 30, 31, 30, 31, 31

        if (year > 1918) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                return (256 - dayInEightMonth - 1) + ".09." + year;
            }
        } else if (year < 1918) {
            if (year % 4 == 0) {
                return (256 - dayInEightMonth - 1) + ".09." + year;
            }
        } else {
            return (256 - dayInEightMonth + 13) + ".09." + year;
        }

        return (256 - dayInEightMonth) + ".09." + year;
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
