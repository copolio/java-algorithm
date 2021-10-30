package com.company.inflearn.string;

import java.util.Scanner;

public class Class12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int nCode = Integer.parseInt(scanner.nextLine(), 10);
        String answer = "";
        String input = scanner.nextLine();
        int tokenSize = input.length() / nCode;
        input = input.replace("#", "1");
        input = input.replace("*", "0");
        for (int i = 0; i < nCode; i++) {
            String code = input.substring(i * (tokenSize), (i + 1)*tokenSize);
            int binaryCode = Integer.parseInt(code, 2);
            answer += (char)binaryCode;
        }
        System.out.print(answer);
    }
}
