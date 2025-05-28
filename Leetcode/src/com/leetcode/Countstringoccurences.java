package com.leetcode;
import java.util.Scanner;
public class Countstringoccurences {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;
        String temp="";
        for(int i=0;i<str1.length();i++)
        {
            temp+=str1.charAt(i);
            if(str2.equals(temp)) 
            {
                count++;
                i--;
                temp="";
            }
            if(temp.length()>str2.length()) temp="";
        }
        System.out.println(count);
    }
}
