package algorithms.implementation.between_two_sets;

// Problem name: Between Two Sets
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/between-two-sets/problem

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // my code starts

        // lcm -> lowest common multiple
        // gcf -> greatest common factor

        a.sort(null);
        b.sort(null);

        int lcm = lowestCommonMultiple(a);
        int gcf = greatestCommonFactor(b);
        int count = 0;

        for (int i = lcm; i <= gcf; i += lcm) {
            if (gcf % i == 0) count++;
        }

        return count;
        // my code ends
    }

    private static int greatestCommonFactor(List<Integer> list) {
        for (int i = list.get(0); i > 0; i--) {
            boolean flag = true;
            for (int j : list) {
                if (j % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return 1;
    }

    private static int lowestCommonMultiple(List<Integer> list) {
        int lcm = list.get(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            if (lcm % list.get(i) != 0) {
                lcm = findLCM(lcm, list.get(i));
            }
        }
        return lcm;
    }

    private static int findLCM(int a, int b) {
        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int lcm = max;
        while (lcm % min != 0) {
            lcm += max;
        }
        return lcm;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
