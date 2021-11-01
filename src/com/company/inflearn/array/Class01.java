package com.company.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Class01 {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> numArray = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (numArray.isEmpty() || num > numArray.get(i-1)) {
                answer.add(num);
            }
            numArray.add(num);
        }
        for (int i = 0; i < answer.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer.get(i));
        }
    }
}
