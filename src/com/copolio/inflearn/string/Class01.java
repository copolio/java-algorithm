package com.copolio.inflearn.string;

import java.util.Scanner;

public class Class01 {
    public long solution(String str, char t) {
        str = str.toUpperCase();
        char ch = Character.toUpperCase(t);
        return str.chars().filter(i -> i == ch).count();
    }

    public static void main(String[] args){
        Class01 T = new Class01();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(T.solution(input1, input2));
    }
}
