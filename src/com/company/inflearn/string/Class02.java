package com.company.inflearn.string;

import java.util.Scanner;

public class Class02 {
    public String solution(String input) {
        StringBuilder answer = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            } else {
                answer.append(Character.toUpperCase(ch));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Class02 T = new Class02();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.print(T.solution(input));
    }
}