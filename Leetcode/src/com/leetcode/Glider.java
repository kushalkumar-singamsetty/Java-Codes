package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class Glider {
	public static void main(String[] args) {
		int[] arr = {-2,4,2,1,1};
		System.out.println(solve(arr));
	}
	public  static int solve(int[] arr)
	{
//		int[] arr = new int[n.size()];
		if(arr.length < 3) return 0;
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp = arr[i]+arr[j];
				if(temp>0 && temp<min ) min = temp;
			}
		}
		int count = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j==i) continue;
				int temp = arr[i]+arr[j];
				if(temp == min) count++;
			}
		}
		return count/3;
	}
}
