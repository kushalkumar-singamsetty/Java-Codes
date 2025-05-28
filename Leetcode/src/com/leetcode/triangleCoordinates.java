package com.leetcode;

import java.util.Scanner;

public class triangleCoordinates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();
		int x1 = scanner.nextInt();
		int k = scanner.nextInt();
		int result = findMinimumYCoordinate(x2, y2, x3, y3, x1, k);
		System.out.println(result);
	}

	public static int findMinimumYCoordinate(int x2, int y2, int x3, int y3, int x1, int k){
    	int base = Math.abs(y3 - y2);
        int height = x1 - 1;
        int area = (base * height) / 2;
        if (area >= k) {
            return y2 + height;
        }
        int diff = k - area;
        int y1 = y2 + height + (diff / (x1 - 1));
        if (diff % (x1 - 1) != 0) {
            y1++;
        }
        return y1;
    }
}