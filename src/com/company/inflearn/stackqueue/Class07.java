package com.company.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String required = scanner.next();
        String schedule = scanner.next();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < required.length(); i++) {
            queue.add(required.charAt(i));
        }

        String answer = "NO";
        for (int i = 0; i < schedule.length(); i++) {
            if (queue.isEmpty()) {
                answer = "YES";
                break;
            }
            if (schedule.charAt(i) == queue.get(0)) {
                queue.remove();
            }
        }

        if (queue.isEmpty()) {
            answer = "YES";
        }

        System.out.print(answer);
    }
}
