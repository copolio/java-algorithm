package com.company.inflearn.string;

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char cur = input.charAt(0);
        int cnt = 1;
        for (int i = 1, j = input.length(); i < j; i++) {
            if (input.charAt(i) == cur) {
                if (cnt == 1) {
                    sb.append(cur);
                }
                cnt++;
                if (i == j - 1) {
                    sb.append(cnt);
                }
            } else {
                if (cnt > 1) {
                    sb.append(cnt);
                } else {
                    sb.append(cur);
                }
                cnt = 1;
                cur = input.charAt(i);
                if (i == j - 1) {
                    sb.append(cur);
                }
            }
        }
        String answer = sb.toString();
        System.out.print(answer);
    }
}
