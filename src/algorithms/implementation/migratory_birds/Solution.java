package algorithms.implementation.migratory_birds;

// Problem name: Migratory Birds
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int migratoryBirds(List<Integer> arr) {
        // my code starts
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int id = arr.get(i);
            if (map.get(id) == null) {
                map.put(id, 1);
            } else {
                map.put(id, map.get(id) + 1);
            }
        }

        int minId = 1;
        int maxFreq = 0;
        for (Integer id : map.keySet()) {
            if (map.get(id) > maxFreq) {
                minId = id;
                maxFreq = map.get(id);
            } else if (map.get(id) == maxFreq) {
                if (id < minId) {
                    minId = id;
                }
            }
        }
        return minId;
        // my code ends
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
