package com.copolio.inflearn.recursivetreegraph;

import java.util.Scanner;

public class Class02 {
    int maxSize = 0;
    int limit = 0;

    public void dfs(int[] graph, boolean[] visited, int cur, int sum) {
        if (sum > limit) {
            return;
        }
        if (sum > maxSize) {
            maxSize = sum;
        }
        for (int i = cur; i < graph.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(graph, visited, i, sum+graph[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Class02 class02 = new Class02();

        Scanner scanner = new Scanner(System.in);
        class02.limit = scanner.nextInt();
        int n = scanner.nextInt();
        int[] graph = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = scanner.nextInt();
        }
        class02.dfs(graph, visited, 0, 0);
        System.out.println(class02.maxSize);
    }
}


