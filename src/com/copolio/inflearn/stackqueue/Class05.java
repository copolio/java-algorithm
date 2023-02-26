package com.copolio.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int nPipes = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                nPipes++;
            } else {
                stack.pop();
                nPipes--;
                if (input.charAt(i - 1) == '(') {
                    answer += nPipes;
                } else {
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}
