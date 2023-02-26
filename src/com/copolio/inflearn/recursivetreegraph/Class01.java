package com.copolio.inflearn.recursivetreegraph;

import java.util.ArrayList;
import java.util.Scanner;

public class Class01 {
    private boolean answer = false;

    public void DFS(ArrayList<Integer> graph, ArrayList<Integer> visited, int cur) {
        if (graph.isEmpty()) {
            return;
        }
        if (graph.stream().mapToInt(i -> i).sum() == visited.stream().mapToInt(i -> i).sum()) {
            this.answer = true;
            return;
        }
        for (int i = cur; i < graph.size(); i++) {
            ArrayList<Integer> newVisited = new ArrayList<>(visited);
            ArrayList<Integer> newGraph = new ArrayList<>(graph);

            newVisited.add(graph.get(i));
            newGraph.remove(i);
            DFS(newGraph, newVisited, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> graph = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(scanner.nextInt());
        }
        Class01 class01 = new Class01();
        class01.DFS(graph, new ArrayList<>(), 0);
        if (class01.answer) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
