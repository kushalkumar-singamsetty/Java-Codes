package com.leetcode;

public class BreakingRecords {

	public static void main(String[] args) {
		int[] arr= {3 ,4, 21, 36, 10, 28, 35, 5, 24, 42};
		int h=arr[0],l=arr[0];
		int max=0,min=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>h)
			{
				h=arr[i];
				max++;
			}
			if(arr[i]<l)
			{
				l=arr[i];
				min++;
			}
		}
		System.out.println(max+" "+min);
	}

}
