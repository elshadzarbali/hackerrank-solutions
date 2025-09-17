package algorithms.warmup.plus_minus;

// Problem name: Plus Minus
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        // my code starts
        int positive = 0, negative = 0, zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f\n", (double) positive / arr.size());
        System.out.printf("%.6f\n", (double) negative / arr.size());
        System.out.printf("%.6f\n", (double) zero / arr.size());
        // my code ends
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }

}