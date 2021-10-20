package com.company.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int nWords = scanner.nextInt();
        for (int i = 0; i < nWords; i++) {
            String word = scanner.next();
            words.add(word);
        }
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(reversedWord);
        }
    }
}
