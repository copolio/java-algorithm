package com.company.inflearn.sortsearch;

import java.util.*;

public class Class06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> students = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(scanner.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            List<Integer> sorted = students.subList(i, n);
            Integer cur = students.get(i);
            if (!Collections.min(sorted).equals(cur)) {
                answer.add(i+1);
                Collections.sort(students);
                answer.add(students.lastIndexOf(cur)+1);
                break;
            }
        }
        for (Integer ans : answer) {
            System.out.print(ans + " ");
        }
    }
}
