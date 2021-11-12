package com.company.inflearn.array;

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStudent = scanner.nextInt();
        int[][] table = new int[nStudent][5];
        int answer = 0, max = 0;
        for (int i = 0; i < nStudent; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nStudent; i++) {
            int nMate = 0;
            for (int j = 0; j < nStudent; j++) {
                if (i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (table[i][k] == table[j][k]) {
                        nMate++;
                        break;
                    }
                }
            }
            if (nMate > max) {
                max = nMate;
                answer = i;
            }
        }
        System.out.print(answer+1);
    }
}
