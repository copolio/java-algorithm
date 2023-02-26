package com.copolio.inflearn.sortsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        Collections.sort(array);

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(' ');
            System.out.print(array.get(i));
        }
    }
}
