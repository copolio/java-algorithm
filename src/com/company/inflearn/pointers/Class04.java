package com.company.inflearn.pointers;

import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] series = new int[n];

        for (int i = 0; i < n; i++) {
            series[i] = scanner.nextInt();
        }

        int answer = 0, lpos = 0, rpos = 0, sum = 0;
        while (rpos < n && lpos <= rpos) {
            sum += series[rpos];
            if (sum >= m) {
                if (sum == m) {
                    answer++;
                }
                lpos++;
                rpos = lpos;
                sum = 0;
            } else {
                rpos++;
            }
        }
        System.out.print(answer);
    }
}
