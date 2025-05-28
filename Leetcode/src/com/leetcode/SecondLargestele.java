package com.leetcode;

public class SecondLargestele {

	public static void main(String[] args) {
		int[] arr = {9,-1,-2,13,-4};
		int l1=arr[0],l2=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>l1)
			{
				l2=l1;
				l1=arr[i];
			}
			else if(arr[i]>l2 && arr[i]<l1) l2=arr[i];
		}
		System.out.println(l2);
	}

}
