package com.leetcode;

public class Fibannocii {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		while(a>=0 && a<=10)
		{
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;
		}
		fbSeries(0, 1,0);
	}
	public static void fbSeries(int a,int b,int count)
	{
		if(count>10) return;
		System.out.print(a+" ");
		int c = a+b;
		fbSeries(a=b, b=c,++count);
	}
}
