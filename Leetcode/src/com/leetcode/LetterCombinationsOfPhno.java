package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LetterCombinationsOfPhno {
	static List<String> Allcombinations = new ArrayList<String>();
	public static void main(String[] args) {
		System.out.println(letterCombinations("234"));
	}
	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < digits.length(); i++) {
			res.add(returnValues(Integer.parseInt(digits.charAt(i)+""))); 
		}
		if(res.size()==1)
		{
			for(int i=0;i<res.get(0).length();i++)
			{
				Allcombinations.add(res.get(0).charAt(i)+"");
			}
			return Allcombinations;
		}
		for(int i=0;i<res.size()-1;i++)
		{
			combinations(res.get(i),res.get(i+1));
		}
		return Allcombinations;
    }
	public static void combinations(String given, String combine) {
		for(int i=0;i<given.length();i++)
		{
			char c = given.charAt(i);
			for(int j=0;j<combine.length();j++)
			{
				Allcombinations.add(c+""+combine.charAt(j));
			}
		}
	}
	public static String returnValues(Integer val)
	{
		LinkedHashMap<Integer,String> nums = new LinkedHashMap<Integer,String>();
        nums.put(2,"abc");
        nums.put(3,"def");
        nums.put(4,"ghi");
        nums.put(5,"jkl");
        nums.put(6,"mno");
        nums.put(7,"pqrs");
        nums.put(8,"tuv");
        nums.put(9,"wxyz");
       return nums.get(val);
	}
}
