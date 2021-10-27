package com.company.inflearn.string;

import java.util.Scanner;

public class Class09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                sb.append(input.charAt(i));
            }
        }
        String answer = sb.toString();
        System.out.print(Integer.parseInt(answer));
    }
}
