package com.copolio.inflearn.sortsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        Collections.sort(array);
        System.out.print(array.indexOf(m) + 1);
    }
}
