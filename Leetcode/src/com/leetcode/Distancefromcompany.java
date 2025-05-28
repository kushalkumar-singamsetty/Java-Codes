package com.leetcode;

public class Distancefromcompany {
	public static int[] funDistance(int[] inputDist,int start,int end)
	{
		int[] answer = new int[100];
		int count =0;
		boolean flag = false;
		if(start<0 || end<0 || start>end)
		{
			int temp = start;
			start = start>end?end:start;
			end = temp;
		}
		for(int num:inputDist)
		{
			if(num>=start && num<=end)
			{
				answer[count++]=num;
				flag = true;
			}
		}
		if(!(flag)) answer[0] = -1;
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {29,38,-12,48,1,2,39,55};
		int start = 3;
		int end = 0;
		int[] res = funDistance(arr, start, end);
		for(int i=0;i<res.length;i++)
		{
			if(res[i]==0) continue;
			System.out.print(res[i]+" ");
		}
 	}
}
