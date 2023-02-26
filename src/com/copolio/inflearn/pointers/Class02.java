package com.copolio.inflearn.pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        int l = 0, r = 0;
        while (l < a.size() && r < b.size()) {
            if (a.get(l).equals(b.get(r))) {
                answer.add(a.get(l));
                l++;
                r++;
            } else if (a.get(l) > b.get(r)) {
                r++;
            } else {
                l++;
            }
        }
        for (Integer num : answer) {
            if (!num.equals(answer.get(0))) System.out.print(" ");
            System.out.print(num);
        }
    }
}
