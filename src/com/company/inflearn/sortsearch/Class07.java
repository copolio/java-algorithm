package com.company.inflearn.sortsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<int[]> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new int[]{x, y});
        }
        points.sort((point1, point2) -> point1[0] != point2[0] ? point1[0] - point2[0] : point1[1] - point2[1]);
        for (int i = 0; i < n; i++) {
            System.out.println(points.get(i)[0] + " " + points.get(i)[1]);
        }
    }
}
