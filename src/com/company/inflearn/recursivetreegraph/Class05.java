package com.company.inflearn.recursivetreegraph;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[][] dp = new int[n + 1][r + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int min = Math.min(i, r);
            dp[i][0] = 1;
            for (int j = 1; j <= min; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        System.out.println(dp[n][r]);
    }
}
