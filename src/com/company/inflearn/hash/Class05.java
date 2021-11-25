package com.company.inflearn.hash;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] cards = new int[n];
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    tree.add(cards[i] + cards[j] + cards[l]);
                }
            }
        }
        Iterator<Integer> iterator = tree.descendingIterator();
        Integer answer = -1;
        for (int i = 0; i < k; i++) {
            if (i != k - 1 && !iterator.hasNext()) {
                System.out.print(-1);
                return;
            }
            answer = iterator.next();
        }
        System.out.print(answer);
    }
}
