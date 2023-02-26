package com.copolio.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Class06 {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Class06 class06 = new Class06();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            String reversed = new StringBuilder(input).reverse().toString();
            int number = Integer.parseInt(reversed, 10);
            if (class06.isPrime(number)) {
                answer.add(number);
            }
        }
        for (int i = 0, j = answer.size(); i < j; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer.get(i));
        }
    }
}
