package com.copolio.inflearn.sortsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        ArrayList<Integer> stables = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stables.add(scanner.nextInt());
        }

        Collections.sort(stables);

        int lt = 1, rt = stables.get(n - 1), answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int cnt = 1, lastPos = stables.get(0);
            for (int i = 1; i < stables.size(); i++) {
                if (stables.get(i) - lastPos >= mid) {
                    cnt++;
                    lastPos = stables.get(i);
                }
            }

            if (cnt >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        System.out.print(answer);
    }
}
