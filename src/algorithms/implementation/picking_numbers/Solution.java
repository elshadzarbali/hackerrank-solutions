package algorithms.implementation.picking_numbers;

// Problem name: Picking Numbers
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/picking-numbers/problem

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        // my code starts

        // Frequency Array approach:
        return frequencyArrayApproach(a);

        // HashMap approach:
//        hashMapApproach(a);

        // Sort + For Loop approach:
//        sortPlusForLoopApproach(a);

        // my code ends
    }

    public static int sortPlusForLoopApproach(List<Integer> a) {
        Collections.sort(a);

        int maxLength = 0;

        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (Math.abs(a.get(j) - a.get(i)) <= 1) {
                    count++;
                } else {
                    break;
                }
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }

        return maxLength;
    }

    public static int hashMapApproach(List<Integer> a) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int key : a) {
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }

        int maxLength = 0;
        for (int key : freqMap.keySet()) {
            int currentLength = freqMap.get(key) + freqMap.getOrDefault(key + 1, 0);
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static int frequencyArrayApproach(List<Integer> a) {
        int[] freq = new int[100];
        for (int num : a) {
            freq[num]++;
        }

        int maxLength = 0;
        for (int i = 1; i < 99; i++) {
            int currentLength = freq[i] + freq[i + 1];
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
