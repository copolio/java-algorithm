package com.copolio.inflearn.sortsearch;

import java.util.LinkedList;
import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int N = scanner.nextInt();
        LinkedList<Integer> cache = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int proc = scanner.nextInt();
            if (cache.isEmpty()) {
                cache.addFirst(proc);
            } else if (cache.size() < S) {
                if (cache.contains(proc)) {
                    cache.remove((Integer) proc);
                }
                cache.addFirst(proc);
            } else {
                if (cache.contains(proc)) {
                    cache.remove((Integer) proc);
                } else {
                    cache.removeLast();
                }
                cache.addFirst(proc);
            }
        }
        for (int i = 0; i < cache.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(cache.get(i));
        }
    }
}
