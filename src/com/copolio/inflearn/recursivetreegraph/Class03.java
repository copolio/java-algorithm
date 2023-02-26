package com.copolio.inflearn.recursivetreegraph;

import java.util.Scanner;

public class Class03 {
    boolean[] visited;
    int[] scores, times;
    int limit, maxScore;

    public void dfs(int cur, int sumTime, int sumScore) {
        if (sumTime > limit) {
            return;
        }
        maxScore = Math.max(sumScore, maxScore);
        for (int i = cur; i < scores.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i,sumTime + times[i], sumScore + scores[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Class03 class03 = new Class03();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        class03.limit = scanner.nextInt();
        class03.scores = new int[n];
        class03.times = new int[n];
        class03.visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();

            class03.scores[i] = score;
            class03.times[i] = time;
        }

        class03.dfs(0,0, 0);
        System.out.print(class03.maxScore);
    }
}
