package com.company.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Class12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = 0;
        ArrayList<ArrayList<Integer>> tests = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> test = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                test.add(scanner.nextInt());
            }
            tests.add(test);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                boolean canMate = true;
                for (int k = 0; k < m; k++) {
                    if (tests.get(k).indexOf(i+1) > tests.get(k).indexOf(j+1)) {
                        canMate = false;
                        break;
                    }
                }
                if (canMate) answer++;
            }
        }
        System.out.print(answer);
    }
}
