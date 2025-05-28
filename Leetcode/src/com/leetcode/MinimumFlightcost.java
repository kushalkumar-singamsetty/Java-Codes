package com.leetcode;

public class MinimumFlightcost extends Exception {

	public static void main(String[] args) {
		int iput1 = 6;
		int[] input2 = {4,12,13,18,10,12};
		System.out.println(minimumCost(iput1, input2));
	}
	public static int minimumCost(int input1,int[] input2)
	{
		int cost = 0;
		if(input2 == null)
		{
			return 0;
		}
		for(int i=0;i<input2.length;i++)
		{
			if((i+1)==(input1-1))
			{
				cost += Math.abs(input2[i+1]-input2[i]);
				i=i+1;
				continue;
			}
			if((i+3)==(input1-1))
			{
				cost += Math.abs(input2[i+3]-input2[i]);
				i=i+3;
				continue;
			}
			cost+=Math.abs(input2[i]-input2[i+1]);
		}
		return cost;
	}
}
