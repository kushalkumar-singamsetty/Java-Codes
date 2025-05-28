package com.leetcode;

public class Temperatureprod {
	public static int productsAtNegative(int[] temperature)
	{
		int answer = 0;
		for (int num : temperature) {
            if (num < 0) {
                answer++;
            }
        }
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {9,-3,8,-6,-7,8,10};
		System.out.println(productsAtNegative(arr));
	}
}
