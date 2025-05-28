package com.leetcode;

public class Leo {
	public static void main(String[] args) {
		int n=4;
		int stars = 1;
		int spaces = n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
//			for(int j=1;i+j>=n+1;j++)
//			{
//				System.out.print("*");
//			}
			System.out.println();
		}
		        
	}
}
