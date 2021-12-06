package com.company.inflearn.sortsearch;

import java.util.HashSet;
import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();

        char answer = 'U';
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (set.contains(num)) {
                answer = 'D';
                break;
            }
            set.add(num);
        }
        System.out.print(answer);
    }
}
