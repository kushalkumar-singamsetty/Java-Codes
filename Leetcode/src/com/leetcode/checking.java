package com.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class checking {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=4;
		long[] arr= {5,5,5,5,5,5,5,5,0,5,5};
		System.out.println(changeArray(arr));
	}
	public static long changeArray(long[] arr)
	{
		long ret=0;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				long temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			long res=toInt(arr);
			if(res%90==0)
			{
				if(res>ret) ret=res;
			}
		}
		return ret;
	}
	static long toInt(long[] arr)
	{
		long temp=0;
		for(int i=1;i<arr.length;i++)
		{
			long ftemp=temp*10+arr[i];
			temp=ftemp;
		}
		return temp;
	}
}
