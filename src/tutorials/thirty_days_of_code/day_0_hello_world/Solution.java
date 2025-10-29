package tutorials.thirty_days_of_code.day_0_hello_world;

// Problem name: Day 0: Hello, World.
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-hello-world/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }
}
