package com.leetcode;

import java.util.Iterator;

public class Smallestelementinsorted {
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,2,3,3,3,3,4};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==arr[arr.length-1]) count++;  
		}
		System.out.println(count);
	}
}
