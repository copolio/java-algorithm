package programmers;

import java.util.*;

public class Lesson160586 {
    private final int MAX_LEN = 100;

    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> answers = new ArrayList<>();
        Map<Character, Integer> minInputMap = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                if (minInputMap.getOrDefault(key.charAt(i), MAX_LEN) > i) {
                    minInputMap.put(key.charAt(i), i+1);
                }
            }
        }

        for (String target : targets) {
            int answer = 0;
            for (int i = 0; i < target.length(); i++) {
                Integer minInput = minInputMap.get(target.charAt(i));
                if (minInput == null) {
                    answer = -1;
                    break;
                }
                answer += minInput;
            }
            answers.add(answer);
        }

        return answers.stream().mapToInt(i -> i).toArray();
    }
}
