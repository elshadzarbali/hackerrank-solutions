package tutorials.thirty_days_of_code.day_7_arrays;

// Problem name: Day 7: Arrays
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-arrays/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();

        // my code starts
        for (int i = arr.size() - 1; i > 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print(arr.get(0));
        // my code ends
    }
}
