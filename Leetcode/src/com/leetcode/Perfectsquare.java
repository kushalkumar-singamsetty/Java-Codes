package com.leetcode;

public class Perfectsquare {

	public static void main(String[] args) {
		int[] arr= {25,77,54,81,48,34};
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			if(check(arr[i])) res++;
		}
		System.out.println(res);
	}
	public static boolean check(int n)
	{
		int i=2,j=2;
		while(i<n/2 || j<n/2)
		{
			if((i*j)==n)
			{
				return true;
			}
			i++; j++;
		}
		return false;
	}
}
