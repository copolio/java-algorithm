package com.copolio.inflearn.sortsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        int[] moves = {5, 1, -1};
        int[] visited = new int[10001];

        Queue<Integer> q = new LinkedList<>();
        q.offer(s);

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == (e)) {
                break;
            }
            for (int i = 0; i < 3; i++) {
                int next = cur + moves[i];
                if (next < 1 || next > 10000 || next == s) {
                    continue;
                }
                if (visited[next] == 0) {
                    q.offer(next);
                    visited[next] = visited[cur] + 1;
                }
            }
        }
        System.out.print(visited[e]);
    }
}
