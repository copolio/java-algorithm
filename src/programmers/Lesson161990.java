package programmers;

import java.util.*;

public class Lesson161990 {
    public static final char FILE = '#';
    public static final char EMPTY = '.';

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = wallpaper.length;
        int luy = wallpaper[0].length();
        int rdx = 0;
        int rdy = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == FILE) {
                    lux = Math.min(i, lux);
                    luy = Math.min(j, luy);
                    rdx = Math.max(i+1, rdx);
                    rdy = Math.max(j+1, rdy);
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        return answer;
    }
}
