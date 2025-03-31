package javab.data_structures.java_2d_array;

// Problem name: Java 2D Array
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // my code
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int sum = findSum(arr, i, j);
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    // my code
    public static int findSum(List<List<Integer>> list, int a, int b) {
        int result = 0;
        for (int i = a; i < a + 3; i++) {
            List<Integer> row = list.get(i);
            for (int j = b; j < b + 3; j++) {
                if (i == a + 1 && j != b + 1) {
                    continue;
                }
                result += row.get(j);

            }
        }
        return result;
    }

}
