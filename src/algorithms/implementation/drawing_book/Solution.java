package algorithms.implementation.drawing_book;

// Problem name: Drawing Book
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/drawing-book/problem

import java.io.*;

class Result {

    public static int pageCount(int n, int p) {
        // my code starts
        if (p <= n / 2) { // start beginning of the book
            return p / 2;
        } else { // (p > n /2 ) start end of the book
            if (n % 2 == 0) {
                return (n + 1 - p) / 2;
            } else {
                return (n - p) / 2;
            }
        }
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
