package com.copolio.inflearn.string;

import java.util.Scanner;

public class Class06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) answer += input.charAt(i);
        }
        System.out.print(answer);
    }
}
