package com.leetcode;

public class Armstrongno {
	private Armstrongno() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		int start = 0;
		int end = 500;
		for (int i = start; i <= end; i++) {
			checkNo(i);
		}

	}

	public static void checkNo(int num) {
		int temp = num;
		int res = 0;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		while (temp > 0) {
			res += Math.pow(temp % 10, count);
			temp /= 10;
		}
		if (res == num) {
			System.out.print(num + " ");
		}
	}
}
