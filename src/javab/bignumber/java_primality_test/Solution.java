package javab.bignumber.java_primality_test;

// Problem name: Java Primality Test
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger bigInteger = new BigInteger(n);
        boolean isPrime = bigInteger.isProbablePrime(1);
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }

}
