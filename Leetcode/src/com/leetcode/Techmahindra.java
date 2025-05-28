package com.leetcode;

public class Techmahindra {
	public static void main(String[] args) {
		int start=-30;
		int end=-11;
		int ans=0;
		int small = 0,large =0;
		for(int i=start;i<=end;i++)
		{
			boolean flag=true;
			int k=i;
			if(k<0) k=k*-1;
			if(k==1) continue;
			for(int j=2;j<k/2;j++)
			{
				if(k%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag) 
			{
				System.out.println(i);
				ans+=i;
			}
		}
		System.out.println(ans);
	}
}
