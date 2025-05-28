package com.leetcode;

public class Arrays {
	public static void main(String[] args) {
		int[] arr= {1,9,11,144,6,7,112,95};
		int res=0; int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>res)
			{
				res=arr[i];
				index=i;
			}
		}
		System.out.println(res);
		System.out.println(index);
	}
}
