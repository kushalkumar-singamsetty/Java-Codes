package com.leetcode;


public class ReverseStringSp {
    public static void main(String[] args) {
        String s = "@_";
        System.out.println(reverse(s));
    }
    public static String reverse(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[j]=='@' || arr[j]=='$' || arr[j]== '_')
            {
                j--;
            }
            if(arr[i]=='@' || arr[i]=='$' || arr[i]== '_'){
                    i++;
            }
            else{
                char temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        for(char r : arr)
            {
                res+=r;
            }
            return res;
    }
}