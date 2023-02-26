package com.copolio.inflearn.string;

import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        int[] dists = new int[input1.length()];
        for (int i = 0, j = input1.length(); i < j; i++) {
            dists[i] = 101;
        }

        for (int i = 0, j = input1.length(); i < j; i++) {
            if (input1.charAt(i) == input2.charAt(0)) {
                dists[i] = 0;
                for (int k = 0; k < i; k++) {
                    if (dists[k] > i - k) dists[k] = i - k;
                }
                for (int k = i + 1; k < j; k++) {
                    if (dists[k] > k - i) dists[k] = k - i;
                }
            }
        }

        for (int i = 0, j = dists.length; i < j; i++) {
            System.out.print(dists[i]+" ");
        }
    }
}
