package com.leetcode;

import java.util.Arrays;

public class Linearsearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int num = 4;
		System.out.println(linearSearch(arr, num));
		Arrays.sort(arr);
		System.out.println(binarySearch(arr, 0, arr.length-1, num));
	}
	public static int linearSearch(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num) return i;
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int first,int last,int num)
	{
		if(first>last) return -1;
		int i = (first+last)/2;
		if(arr[i] == num) return i;
		if(num<arr[i]) return binarySearch(arr, first, i-1, num);
		else return binarySearch(arr, i+1, last, num);
	}
	
}
