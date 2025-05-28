package com.leetcode;
import java.util.Arrays;

public class Maximumheight {
	public static void main(String[] args) {
		int input1 = 1;
		int[] input2 = {5};
		System.out.println(maxTreeHeight(input1, input2));
	}

	public static int maxTreeHeight(int input1, int[] input2){
		int maxheight = 0;
		Arrays.sort(input2);
		for(int i=0;i<input2.length;i++)
		{
			if(input2[i]>maxheight) maxheight+=input2[i];
		}
		return maxheight;
//		throw new unsupportedOperationException("maxTreeheight(int input1,int[] input2)");
	} 
}
