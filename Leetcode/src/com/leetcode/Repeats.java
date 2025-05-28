package com.leetcode;

public class Repeats {
	public static void main(String[] args) {
		int[] arr= {-1,-1};
		boolean res=false;
		int count=1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) count++;
			else 
			{
				if(count>1)
				{
					res=true;
					System.out.print(arr[i]+" ");
				}
				count=1;
			}
		}
		if(count>1)
		{
			res=true;
			System.out.print(arr[arr.length-1]);
		}
		if(res==false) System.out.println(-1);
	}

}
