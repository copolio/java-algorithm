package com.company.inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            hash1.put(input1.charAt(i), hash1.getOrDefault(input1.charAt(i), 0)+1);
            hash2.put(input2.charAt(i), hash2.getOrDefault(input2.charAt(i), 0)+1);
        }
        if (hash1.equals(hash2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
