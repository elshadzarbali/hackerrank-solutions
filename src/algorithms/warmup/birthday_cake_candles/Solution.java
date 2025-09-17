package algorithms.warmup.birthday_cake_candles;

// Problem name: Birthday Cake Candles
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // my code starts
        int number = 0;
        int tallest = 0;
        for (int i : candles) {
            if (tallest < i) {
                tallest = i;
                number = 1;
                continue;
            }
            if (tallest == i) {
                number++;
            }
        }
        return number;
        // my code ends
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}