package com.company.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ')') {
                stack.add(input.charAt(i));
            } else {
                while (!stack.empty()) {
                    if (stack.lastElement() == '(') {
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        while (!stack.empty()) {
             answer.insert(0, stack.pop());
        }
        System.out.print(answer);
    }
}
