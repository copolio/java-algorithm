package com.copolio.inflearn.recursivetreegraph;

import java.util.Scanner;

public class Class06 {
    boolean[] visited;
    int[] array, answer;
    int n, f;
    boolean found;

    public void dfs(int[] cur) {
        if (found) return;
        if (cur.length == array.length) {
            int[][] table = new int[n][n];
            System.arraycopy(cur, 0, table[0], 0, n);
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    table[i][j] = table[i - 1][j] + table[i - 1][j + 1];
                }
            }
            if (table[n - 1][0] == f) {
                for (int i = 0; i < n; i++) {
                    System.out.print(cur[i] + " ");
                }
                System.out.println();
                found = true;
                return;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int[] next = new int[cur.length + 1];
                System.arraycopy(cur, 0, next, 0, cur.length);
                next[cur.length] = array[i];
                dfs(next);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class06 class06 = new Class06();
        class06.n = scanner.nextInt();
        class06.f = scanner.nextInt();
        class06.array = new int[class06.n];
        class06.visited = new boolean[class06.n];

        for (int i = 1; i <= class06.n; i++) {
            class06.array[i - 1] = i;
        }

        int[] cur = {};
        class06.dfs(cur);
    }
}
