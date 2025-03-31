package javab.data_structures.java_arraylist;

// Problem name: Java Arraylist
// Difficulty: Easy
// Problem link: https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }

            lists.add(list);
        }

        int q = scanner.nextInt();
        List<List<Integer>> queires = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());

            queires.add(query);
        }

        scanner.close();

        for (int i = 0; i < queires.size(); i++) {
            List<Integer> query = queires.get(i);
            System.out.println(finder(lists, query));
        }
    }

    public static String finder(List<List<Integer>> lists, List<Integer> query) {
        int x = query.get(0) - 1; // line
        int y = query.get(1) - 1; // position

        if (x >= lists.size() || y >= lists.get(x).size()) {
            return "ERROR!";
        }

        return String.valueOf(lists.get(x).get(y));
    }

}
