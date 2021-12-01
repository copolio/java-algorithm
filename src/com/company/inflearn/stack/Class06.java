package com.company.inflearn.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class Class06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        LinkedList<Integer> princes = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            princes.add(i);
        }
        int cnt = 1, cur = 0;
        while (princes.size() > 1) {
            if (cnt == k) {
                princes.remove(cur);
                cnt = 1;
            } else {
                cnt++;
                cur = (cur + 1) % princes.size();
            }
        }
        Integer answer = princes.get(0);
        System.out.print(answer);
    }
}
