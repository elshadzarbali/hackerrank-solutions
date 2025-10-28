package algorithms.implementation.cats_and_a_mouse;

// Problem name: Cats and a Mouse
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

import java.io.*;
import java.util.Scanner;

public class Solution {

    static String catAndMouse(int x, int y, int z) {
        // my code starts
        int catADistance = (z - x) >= 0 ? (z - x) : (x - z);
        int catBDistance = (z - y) >= 0 ? (z - y) : (y - z);
        if (catADistance < catBDistance) return "Cat A";
        else if (catADistance > catBDistance) return "Cat B";
        else return "Mouse C";
        // my code ends
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
