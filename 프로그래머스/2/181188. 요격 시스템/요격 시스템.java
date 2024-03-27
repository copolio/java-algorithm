import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);
        int range = targets[0][1];
        
        for (var target: targets) {
            if (target[0] < range) {
                continue;
            }
            answer++;
            range = target[1];
        }
        return answer;
    }
}