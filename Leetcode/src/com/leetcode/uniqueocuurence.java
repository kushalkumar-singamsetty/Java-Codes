package com.leetcode;

public class uniqueocuurence {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])temp++;
			}
			if(temp==1) count++;
		}
		System.out.println(count);
	}

}
