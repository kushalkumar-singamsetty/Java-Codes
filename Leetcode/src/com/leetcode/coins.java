package com.leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class coins {
	public static void main(String[] args) {
		int n=7;
		int sum=10;
		int arr[]= {1,5,15,6,8,19,10};
		System.out.println(count_ways(arr, n, sum));
	}
	public static int count_ways(int arr[],int n,int sum)
	{
		int minimum_coins=-1;
		 int[] dp = new int[sum + 1];
	        Arrays.fill(dp, sum + 1);
	        dp[0] = 0;
	        for (int coin : arr) {
	            for (int i = coin; i <= sum; i++) {
	                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	            }
	        }
	        return dp[sum] <= sum ? dp[sum] : -1;
	}

}
