package com.copolio.inflearn.array;

import java.util.*;

public class Class08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] scores = new Integer[n];
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            scores[i] = score;
        }
        Integer[] answer = scores.clone();
        Arrays.sort(answer, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(Arrays.asList(answer).indexOf(scores[i]) + 1);
        }
    }
}
