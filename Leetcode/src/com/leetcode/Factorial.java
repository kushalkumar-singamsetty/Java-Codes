package com.leetcode;

public class Factorial {
	public static void main(String[] args) {
		int n =5;
		int res = 1;
		for(int i=1;i<=n;i++)
		{
			res*=i;
		}
		System.out.println(res);
		swapTwo(5,3);
	}
	public static void swapTwo(int a,int b)
	{ 	//a = 5, b= 3
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a+" "+b);
	}
}
