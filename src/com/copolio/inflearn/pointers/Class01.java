package com.copolio.inflearn.pointers;

import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] answer = new int[n + m];
        int nCur = 0, mCur = 0;
        for (int i = 0, j = n + m; i < j; i++) {
            if (nCur < n && array1[nCur] <= array2[mCur]) {
                answer[i] = array1[nCur];
                nCur++;
            } else {
                answer[i] = array2[mCur];
                mCur++;
            }
        }

        for (int i = 0, j = n + m; i < j; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer[i]);
        }
    }
}
