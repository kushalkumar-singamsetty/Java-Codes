package com.leetcode;

public class Discount {
	public static void main(String[] args) {
		int[] arr= {9,-13,8,-7,-8,18,10};
		System.out.println(noOfProducts(arr, 18));
	}
	public static int noOfProducts(int[] order, int discount)
	{
		int answer=0;
		for (int i = 0; i < order.length; i++) {
			if(order[i]<0) continue;
			if(discount%order[i]==0) answer++;
		}
		return answer;
	}
}
