package com.company.inflearn.pointers;

import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            if (i == 0) {
                for (int j = i; j < i + k; j++) {
                    sum += sales[j];
                }
            } else {
                sum -= sales[i - 1];
                sum += sales[i + k - 1];
            }
            if (sum > answer) answer = sum;
        }
        System.out.print(answer);
    }
}
