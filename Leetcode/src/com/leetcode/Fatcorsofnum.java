package com.leetcode;

public class Fatcorsofnum {
	public static void main(String[] args) {
		System.out.println(pthfactor(20, 3));
	}
	public static long pthfactor(long n,long p)
	{
		long res=0;
		for(long i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				res++;
				if(res==p) return i;
			}
		}
		return 0;
	}
}
