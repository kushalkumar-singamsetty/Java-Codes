package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Threads {
	public static void main(String[] args) {
		int n = 3;
		String[] logs = {"0:start:0","1:start:2","1:end:5","2:start:6","2:end:9","0:end:12"};
		int[] arr = getExecutionTime(n, logs);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] getExecutionTime(int n,String[] logs)
	{
		int[] end = new int[n];
		int[] start = new int[n];
		int[] res = new int[n];
		for(int i=0;i<logs.length;i++)
		{
			String temp = logs[i];
			String[] sep = temp.split(":");
			for(int j=0;j<sep.length;j++)
			{
				int id = Integer.parseInt(sep[0]);
				if(sep[1].equals("start"))
				{
					start[id] = Integer.parseInt(sep[2]);
				}
				if(sep[1].equals("end"))
				{
					end[id] = Integer.parseInt(sep[2])+1;
				}
			}
		}
		for(int i = n-1;i>=0;i--)
		{
			res[i] = end[i] - start[i];
		}
		int temp =0;
		for(int i=1;i<res.length;i++) temp+=res[i];
		res[0] = res[0] - temp;
		return res;
	}
}
