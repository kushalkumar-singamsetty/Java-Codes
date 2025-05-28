package com.leetcode;

public class checkadigitisavailable {
	public static void main(String[] args) {
		int a=444;
		int b=444;
		int c=444;
		int res=check(a, b, c);
		if(res!=-1) System.out.println(res);
		else System.out.println("No common elements  "+res);
	}
	public static int check(int a, int b, int c)
	{
		int count1=0;
		while(a>0)
		{
			int b1=b,c1=c;
			int temp=a%10;
			while(b1>0)
			{
				if(b1%10==temp) 
				{
					while(c1>0) 
					{
						if(c1%10==temp) return temp;
						else c1/=10;
					}
				}
				b1/=10;
			}
		}
		return -1;
	}
}
