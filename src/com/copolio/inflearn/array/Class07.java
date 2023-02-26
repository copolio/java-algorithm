package com.copolio.inflearn.array;

import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0, nConsecutive = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == 1) {
                nConsecutive++;
                answer += nConsecutive;
            } else {
                nConsecutive = 0;
            }
        }
        System.out.print(answer);
    }
}
