package com.leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class Minimumproduct {

	public static void main(String[] args) {
		int N=6;
		int[] arr= {1,1,1,3,2,9};
		int s1=arr[0];
		for(int i=0;i<arr.length;i++) if(arr[i]<s1) s1=arr[i];
		int s2=0;int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=s1)
				if(arr[i]>s1)
				{
					s2=arr[i];
				}
			if(arr[i]>s2)  res=s2;
		}
		System.out.println(res);
//		System.out.println(s1+" "+s2);
	}

}
