package javab.introduction.java_static_initializer_block;

// Problem name: Java Static Initializer Block
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.Scanner;

public class Solution {

    static int breadth;
    static int height;

    static {
        Scanner scan = new Scanner(System.in);
        breadth = scan.nextInt();
        height = scan.nextInt();
        scan.close();
    }

    public static void main(String[] args) {
        try {
            if (breadth <= 0 || height <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(breadth * height);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
