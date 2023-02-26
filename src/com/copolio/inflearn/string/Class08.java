package com.copolio.inflearn.string;
import java.util.Scanner;

public class Class08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s = input.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        String answer = "NO";
        if (s.equals(reversed)) {
            answer = "YES";
        }
        System.out.print(answer);
    }
}
