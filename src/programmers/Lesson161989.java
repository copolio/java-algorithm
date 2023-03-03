package programmers;
import java.util.*;

public class Lesson161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        List<Integer> unpaintedZone = new ArrayList<>();
        for (int i : section) {
            unpaintedZone.add(i);
        }

        while (!unpaintedZone.isEmpty()) {
            int begin = unpaintedZone.get(0);
            int end = begin + m - 1;
            unpaintedZone.removeIf(i -> i >= begin && i <= end);
            answer++;
        }

        return answer;
    }
}