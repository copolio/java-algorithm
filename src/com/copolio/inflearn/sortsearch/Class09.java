package com.copolio.inflearn.sortsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer song = scanner.nextInt();
            songs.add(song);
        }

        Integer answer = 0;
        Integer lt = Collections.max(songs);
        Integer rt = songs.stream().mapToInt(i -> i).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int cnt = 1, sum = 0;
            for (Integer song : songs) {
                if (sum + song > mid) {
                    cnt++;
                    sum = song;
                } else {
                    sum += song;
                }
            }
            if (cnt <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        System.out.print(answer);
    }
}
