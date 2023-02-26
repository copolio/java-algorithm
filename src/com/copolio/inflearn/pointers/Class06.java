package com.copolio.inflearn.pointers;

import java.util.Scanner;

public class Class06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            series[i] = scanner.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && series[i - 1] == 1) {
                continue;
            }
            int c = k;
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (series[j] == 0) {
                    if (c == 0) break;
                    c--;
                }
                cnt++;
            }
            answer = Math.max(answer, cnt);
        }

        System.out.print(answer);
    }
}
