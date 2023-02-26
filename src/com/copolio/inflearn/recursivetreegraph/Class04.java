package com.copolio.inflearn.recursivetreegraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCoins = scanner.nextInt();
        ArrayList<Integer> coins = new ArrayList<>();
        for (int i = 0; i < nCoins; i++) {
            coins.add( scanner.nextInt());
        }
        int change = scanner.nextInt();

        //greedy(nCoins, coins, change);
        dp(nCoins, coins, change);
    }

    private static void dp(int nCoins, ArrayList<Integer> coins, int change) {
        int[] dp = new int[change +1];
        Arrays.fill(dp, 500);
        dp[0] = 0;
        coins.sort(Collections.reverseOrder());
        for (int i = 1; i <= change; i++) {
            for (int j = 0; j < nCoins; j++) {
                Integer coin = coins.get(j);
                if (coin <= i && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                }
            }
        }
        System.out.println(dp[change]);
    }

    private static void greedy(int nCoins, ArrayList<Integer> coins, int change) {
        int minCoins = 500;
        int sum = 0;
        int curIdx = 0;
        while(change > 0 && curIdx < nCoins) {
            int coin = coins.get(curIdx);
            if (coin <= change) {
                System.out.println(coin);
                change -= coin;
                sum++;
            } else {
                curIdx++;
            }
        }
        System.out.println(sum);
    }
}
