package algorithms.warmup.time_conversion;

// Problem name: Time Conversion
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;

class Result {

    public static String timeConversion(String s) {
        // my code starts
        boolean isAM = s.endsWith("AM");
        String result = s.substring(0, 8);
        if (isAM) {
            if (result.substring(0, 2).equals("12")) {
                result = result.replaceFirst("12", "00");
            }
        } else {
            int hour = Integer.parseInt(result.substring(0, 2));
            if (hour < 12) {
                result = result.replaceFirst(result.substring(0, 2), String.valueOf(hour + 12));
            }
        }
        return result;
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
