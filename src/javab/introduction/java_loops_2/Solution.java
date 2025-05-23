package javab.introduction.java_loops_2;

// Problem name: Java Loops II
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            mySolution(a, b, n);
        }
        in.close();
    }

    public static void mySolution(int a, int b, int n) {
        int result = a;
        for (int i = 0; i < n; i++) {
            result += (int) Math.pow(2, i) * b;
            System.out.print(result + " ");
        }
        System.out.println();
    }

}
