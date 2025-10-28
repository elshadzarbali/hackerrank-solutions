package algorithms.implementation.number_line_jumps;

// Problem name: Number Line Jumps
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/kangaroo/problem

import java.io.*;

class Result {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // my code starts
        if (x1 == x2 && v1 == v2) {
            return "YES";
        } else if (x1 < x2 && v1 <= v2) {
            return "NO";
        } else if (x1 > x2 && v1 >= v2) {
            return "NO";
        } else {
            if (Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0) return "YES";
        }
        return "NO";
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
