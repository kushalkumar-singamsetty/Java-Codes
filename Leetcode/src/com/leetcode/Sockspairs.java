package com.leetcode;

public class Sockspairs {

	public static void main(String[] args) {
		int[] arr = {1,1,3,1,2,1,3,3,3,3};
		int res=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int temp=arr[i],count=1;
			if(temp==0) continue;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) 
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>=2) res+=count/2;
		}
		System.out.println(res);
		
	}

}
