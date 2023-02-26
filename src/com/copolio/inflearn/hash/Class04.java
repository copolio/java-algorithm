package com.copolio.inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < input2.length(); i++) {
            hash1.put(input1.charAt(i), hash1.getOrDefault(input1.charAt(i), 0) + 1);
            hash2.put(input2.charAt(i), hash2.getOrDefault(input2.charAt(i), 0) + 1);
        }
        if (hash1.equals(hash2)) answer++;
        for (int i = input2.length(); i < input1.length(); i++) {
            hash1.put(input1.charAt(i), hash1.getOrDefault(input1.charAt(i), 0) + 1);
            char key = input1.charAt(i - input2.length());
            Integer count = hash1.get(key);
            if (count == 1) {
                hash1.remove(key);
            } else {
                hash1.put(key, hash1.get(key) - 1);
            }
            if (hash1.equals(hash2)) answer++;
        }
        System.out.print(answer);
    }
}
