package javab.bignumber.java_biginteger;

// Problem name: Java BigInteger
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BigInteger a = new BigInteger(bufferedReader.readLine());
        BigInteger b = new BigInteger(bufferedReader.readLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        bufferedReader.close();
    }

}
