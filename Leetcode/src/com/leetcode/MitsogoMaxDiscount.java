package com.leetcode;

public class MitsogoMaxDiscount {
	public static void main(String[] args) {
		int[] uniqueId = {2,1,1};
		int unsize = 3;
		int[] profit = {10,2,5};
		int prsize = 3;
		MitsogoMaxDiscount m1 = new MitsogoMaxDiscount();
		System.out.println(m1.maxprofit(uniqueId, unsize, profit, prsize));
	}
	public int maxprofit(int[] uniqueId,int unsize,int[] profit,int prsize)
	{
		if(unsize != prsize) return 0;
		int res = 0;
		for(int i=0;i<unsize;i++)
		{
			int id = uniqueId[i];
			if((i!=unsize-1)&&(id == uniqueId[i+1]))
			{
				 int temp =((profit[i]>=profit[i+1])? profit[i]:profit[i+1]);
				 res+=(temp>0)?temp:0;
				 i++;
			}
			else
			{
				res+=(profit[i]<=0)?0:profit[i];
			}
		}
		return res;
	}
}
