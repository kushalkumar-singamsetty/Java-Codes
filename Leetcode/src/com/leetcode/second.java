package com.leetcode;

public class second {
	public static void main(String[] args) {
		int[] arr= {11,22,45,63,78};
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int sum=0;
			while(temp>0)
			{
				sum+=temp%10;
				temp/=10;
			}
			ans[i]=sum;
		}
		for (int i : ans) {
			System.out.print(i+" ");
		}
	}
}
