package com.leetcode;

public class Longest {
	public static void main(String[] args) {
		String input_from_question="malayalam";
		char[] ch=input_from_question.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			boolean key=true;
			for(int j=i+1;j<ch.length;j++)
			{
				while(i<j)
				{
					if(ch[i]!=ch[j]) 
					{
						key=false;
//						break;
					}
					i++;
					j--;
				}
				if(key) System.out.println(i+" "+j);
			}
		}
	}
}
