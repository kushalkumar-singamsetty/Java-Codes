package com.leetcode;

import java.util.Iterator;

public class Matrixadditon {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			int inc=1,temp=0;
			for (int j =arr[i].length-1; j>-1; j--) {
				temp+=arr[i][j]*inc;
				inc*=10;
			}
			System.out.println(temp);
			sum+=temp;
		}
		System.out.println(sum);
	}
}
