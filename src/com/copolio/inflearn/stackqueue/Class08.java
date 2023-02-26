package com.copolio.inflearn.stackqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Class08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(scanner.nextInt());
        }

        int curPos = m;
        while (true) {
            Integer first = queue.getFirst();
            queue.remove();
            Integer max = Collections.max(queue);
            if (first < max) {
                if (curPos == 0) {
                    curPos = queue.size();
                } else {
                    curPos--;
                }
                queue.offer(first);
            } else {
                answer++;
                if (curPos == 0) {
                    break;
                } else {
                    curPos--;
                }
            }
        }

        System.out.print(answer);
    }
}
