package com.company.inflearn.string;

import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        String answer = "YES";
        while (left <= right) {
            if (Character.toUpperCase(chars[left]) == Character.toUpperCase(chars[right])) {
                left++;
                right--;
            } else {
                answer = "NO";
                break;
            }
        }
        System.out.print(answer);
    }
}
