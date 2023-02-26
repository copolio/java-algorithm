package com.copolio.inflearn.recursivetreegraph;

import java.util.Scanner;

public class Class07 {
    int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int[][] graph = new int[7][7];
    boolean[][] visited = new boolean[7][7];
    int answer = 0;

    public void dfs(int[] cur) {
        if (cur[0] == 6 && cur[1] == 6) {
            answer++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nextY = cur[0] + moves[i][0];
            int nextX = cur[1] + moves[i][1];
            int[] next = {nextY, nextX};

            if (nextY >= 0 && nextY < 7 && nextX >= 0 && nextX < 7) {
                if (graph[nextY][nextX] == 0 && !visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    dfs(next);
                    visited[nextY][nextX] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Class07 class07 = new Class07();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                class07.graph[i][j] = scanner.nextInt();
            }
        }
        class07.visited[0][0] = true;
        class07.dfs(new int[]{0, 0});

        System.out.println(class07.answer);
    }
}
