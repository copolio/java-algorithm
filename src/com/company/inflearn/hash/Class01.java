package com.company.inflearn.hash;

import java.util.*;

public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dict.put(input.charAt(i), dict.getOrDefault(input.charAt(i), 0) + 1);
        }
        System.out.print(Collections.max(dict.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
