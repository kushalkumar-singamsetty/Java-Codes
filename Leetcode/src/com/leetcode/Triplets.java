package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Triplets {

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}
	 public static void threeSum(int[] nums)
	 {
		 ArrayList res = new ArrayList();
		 
		 for (int i = 0; i < nums.length-3; i++)
		 {
			ArrayList temp = new ArrayList();
			res.add(temp);
		 }
		 System.out.println(res);
	 }
}
