package com.leetcode;

public class Repeatelements {
	public static void main(String[] args) {
		int N=8;
		int[] arr={0,0,0,1,2,2,2,2,2};
		String s="";
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				if(s.indexOf(arr[i]+"")==-1) s+=arr[i]+" ";
				count++;
			}
		}
		if(count==0) System.out.println(-1);
		else System.out.println(s);
	}
}
