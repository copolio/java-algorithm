package com.copolio.inflearn.array;

import java.util.Scanner;

public class Class09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] table = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cell = scanner.nextInt();
                table[i][j] = cell;
            }
        }
        int dLSum = 0, dRSum = 0;
        for (int i = 0; i < n; i++) {
            int hSum = 0, vSum = 0;
            dLSum += table[i][i];
            dRSum += table[i][n-i-1];
            for (int j = 0; j < n; j++) {
                hSum += table[i][j];
                vSum += table[j][i];
            }
            max = Math.max(hSum, max);
            max = Math.max(vSum, max);
        }
        max = Math.max(dLSum, max);
        max = Math.max(dRSum, max);
        System.out.print(max);
    }
}
