package com.copolio.inflearn.array;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) continue;
            for (int j = i + i; j <= n; j+= i) {
                prime[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) answer++;
        }
        System.out.print(answer);
    }
}
