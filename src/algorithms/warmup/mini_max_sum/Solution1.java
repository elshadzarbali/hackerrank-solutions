package algorithms.warmup.mini_max_sum;

// Problem name: Mini-Max Sum
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result1 {

    public static void miniMaxSum(List<Integer> arr) {
        // my code starts
        long sum = 0;
        int max = 0, min = arr.get(0);
        for (int i : arr) {
            sum += i;
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println((sum - max) + " " + (sum - min));
        // my code ends
    }

}

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }

}