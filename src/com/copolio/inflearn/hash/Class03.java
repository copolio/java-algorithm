package com.copolio.inflearn.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> sales = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sales.add(scanner.nextInt());
        }
        for (int i = 0; i < k; i++) {
            hash.put(sales.get(i), hash.getOrDefault(sales.get(i), 0) + 1);
        }
        answer.add(hash.size());
        for (int i = 1; i <= n - k; i++) {
            int count = hash.get(sales.get(i - 1)) - 1;
            if (count == 0) {
                hash.remove(sales.get(i - 1));
            } else {
                hash.remove(sales.get(i - 1));
                hash.put(sales.get(i - 1), count);
            }
            hash.put(sales.get(i + k - 1), hash.getOrDefault(sales.get(i + k - 1), 0) + 1);
            answer.add(hash.size());
        }

        for (int i = 0; i < answer.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer.get(i));
        }
    }
}
