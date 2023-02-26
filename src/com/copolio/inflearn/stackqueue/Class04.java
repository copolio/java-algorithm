package com.copolio.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                Integer num1, num2;
                num2 = stack.pop();
                num1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num1 - num2);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        System.out.print(stack.pop());
    }
}
