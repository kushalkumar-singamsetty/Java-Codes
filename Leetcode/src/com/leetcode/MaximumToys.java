package com.leetcode;

public class MaximumToys {

	public static void main(String[] args) {
		int[] price = {1,4,5,3,2,1,6};
		int money = 6;
		MaximumToys mt = new MaximumToys();
		System.out.println(mt.maximumToys(price, money));
	}
	public int maximumToys(int[] price , int money)
	{
		int count1 = 0 , count2 = 0;
		for (int i = 0; i < price.length; i++) {
			int temp = 0;
			for (int j = i; j < price.length; j++) {
				if (temp >= money)
					break;
				else
				{
					temp += price[j];
					count2++;
				}
			}
			count2 = (temp==money)?count2:0;
			count1 = (count2 > count1) ? count2 : count1;
		}
		return count1;
//		int sum = 0;
//	    int count = 0;
//	    int max = 0;
//	    for (int i = 0; i < prices.length; i++)
//	      {
//		sum = count = 0;
//		for (int j = i; j < prices.length; j++)
//		  {
//		    if ((sum + prices[j]) <= money)
//		      {
//			sum = sum + prices[j];
//			count = count + 1;
//			max = Math.max (count, max);
//		      }
//		    else
//		      {
//			count = 0;
//			sum = 0;
//			break;
//		      }
//		  }
//	      }
//	    return max;
	}

}
