package com.company.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Class03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        int answer = 0;
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][move] != 0) {
                    int doll = board[j][move];
                    board[j][move] = 0;
                    if (!basket.empty() && doll == (basket.lastElement())) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
