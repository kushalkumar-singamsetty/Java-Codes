package com.leetcode;

public class evenodd {
	public static void main(String[] args) {
		int[] arr= {2,4,5,3,4,5,6,3,1,2};
		int[] res=funcArrange(arr);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}
	public static int[] funcArrange(int[] inputArr) {
 		int[] answer=new int[inputArr.length];
		for(int i=0;i<inputArr.length-1;i++)
		{
			if(inputArr[i]%2==0) continue;
			else
			{
				for(int j=i;j<inputArr.length;j++)
				{
					if(inputArr[j]%2==0) 
					{
						int temp=inputArr[i];
						inputArr[i]=inputArr[j];
						inputArr[j]=temp;
					}
				}
			}
		}
		answer=inputArr;
		return answer;
	}
}
