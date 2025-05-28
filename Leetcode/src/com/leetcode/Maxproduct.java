package com.leetcode;

public class Maxproduct {

	public static void main(String[] args) {
		int n=7;
		int arr[]= {};
		System.out.println(max_product(arr, n));
	}
	public static long max_product(int arr[],int n)
	{
		long maxi_value=-1;
		for (int i = 0; i < arr.length; i++) {
			maxi_value*=arr[i];
		}
		if(maxi_value<0) maxi_value*=-1;
		return maxi_value;
	}
}
