package com.leetcode;
import java.util.regex.*;
public class Reverse {

	public static void main(String[] args) {
		String s="-4193 with words";
		Pattern p=Pattern.compile("[+,-][1-9]");
		Matcher m = p.matcher(s);
		if(m.find())
		{
			System.out.println(m.group());
		}
	}
}
