package com.company.inflearn.array;

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxHeight = 0, answer = 0;
        for (int i = 0; i < n; i++) {
            int student = scanner.nextInt();
            if (student > maxHeight) {
                maxHeight = student;
                answer++;
            }
        }
        System.out.print(answer);
    }
}
