package com.copolio.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Class01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Stack<Character> stack = new Stack<>();
        String answer = "NO";
        while(!input.isEmpty()) {
            if (input.charAt(0) == ')') {
                if (stack.empty()) {
                    break;
                }
                stack.pop();
            } else {
                stack.add(input.charAt(0));
            }
            input = input.substring(1);
        }
        if (stack.empty() && input.isEmpty()) {
            answer = "YES";
        }
        System.out.print(answer);
    }
}
