package com.leetcode;

import java.util.Scanner;

public class Bakka {
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static int solve(int s) {
        int[] sequence = new int[s]; 
        int count = 0;
        sequence[count++] = s;
        while(s > 1) {
            if (s % 2 == 0) {
                s -= (s - 2 > 1) ? s - 2 : 1; 
            } else {
                s -= 1;
            }
            sequence[count++] = s;
        }
        int[] beautifulSequence = new int[count];
        for (int i = 0; i < count; i++) {
            beautifulSequence[i] = sequence[count - 1 - i];
        }
        return count; 
    }
    public static void main(String[] args) {
        int s = readNumber(); // Read the input for each test case
        int result = solve(s); // Solve the problem
        System.out.println(result); // Print the output
    }
}