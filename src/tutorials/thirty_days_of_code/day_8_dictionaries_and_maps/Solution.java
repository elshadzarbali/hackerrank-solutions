package tutorials.thirty_days_of_code.day_8_dictionaries_and_maps;

// Problem name: Day 8: Dictionaries and Maps
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();

            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            Integer value = null;
            if ((value = phoneBook.get(s)) != null) {
                System.out.println(s + "=" + value);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
