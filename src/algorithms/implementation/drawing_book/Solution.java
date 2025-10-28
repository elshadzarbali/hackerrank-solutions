package algorithms.implementation.divisible_sum_pairs;

// Problem name: Divisible Sum Pairs
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // my code starts
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                int b = ar.get(j);
                if ((a + b) % k == 0) count++;
            }
        }

        return count;
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
