package com.leetcode;

public class Bitcoin {

	public static void main(String[] args) {
		int n=10;
		int arr[]= {2,2,3,4,2,3,2,2};
		System.out.println(longest_alternate_subs(arr, n));
	}
	public static int longest_alternate_subs(int arr[],int n)
	{
		int maximum_length=-1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]<arr[i+1] || arr[i]>arr[i+1]) maximum_length--;
			System.out.println(maximum_length);
		}
		maximum_length*=-1;
		return maximum_length;
	}
}
