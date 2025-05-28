package com.leetcode;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Tap {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = scanner.nextLine();
        Pattern p = Pattern.compile(ss);
        Matcher m = p.matcher(s);
        int res=0;
        while(m.find())
        {
        	 res++;
        }
        System.out.println(res);
    }
}
