package com.copolio.inflearn.pointers;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum >= n) {
                    if (sum == n) answer++;
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
