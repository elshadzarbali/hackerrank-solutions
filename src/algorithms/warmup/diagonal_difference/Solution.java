package algorithms.warmup.diagonal_difference;

// Problem name: Diagonal Difference
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // my code starts
        int firstDiagonal = 0, secondDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(firstDiagonal - secondDiagonal);
        // my code ends
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
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

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}