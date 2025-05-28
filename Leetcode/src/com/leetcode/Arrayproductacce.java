package com.leetcode;

import java.util.Arrays;

public class Arrayproductacce {
	public static void main(String[] args) {
		int[] a1= {2,4,6};
		int[] res=new int[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			int temp=1;
			for(int j=0;j<a1.length;j++)
			{
				if(i==j) continue;
				temp*=a1[j];
			}
			res[i]=temp;
		}
		System.out.println(Arrays.toString(res));
	}
}
