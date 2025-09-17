package algorithms.warmup.compare_the_triplets;

// Problem name: Compare the Triplets
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] arr = new Integer[]{0, 0};
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                arr[0]++;
            } else if (a.get(i) < b.get(i)) {
                arr[1]++;
            }
        }
        return new ArrayList<>(Arrays.asList(arr));
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}