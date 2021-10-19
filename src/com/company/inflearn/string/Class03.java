package com.company.inflearn.string;

import java.util.Scanner;

public class Class03 {
    public String solution(String str) {
        String answer = "";
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() > answer.length()) {
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Class03 T = new Class03();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.print(T.solution(input));
    }
}
