package com.leetcode;

import java.util.Scanner;

public class ArrayMerger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int[] arr1 = new int[a1];
        for(int i=0;i<a1;i++) arr1[i]=scanner.nextInt();
        int a2 = scanner.nextInt();
        int[] arr2 = new int[a2];
        for(int i=0;i<a2;i++) arr2[i]=scanner.nextInt();
        int[] res = new int[a1+a2];
        System.arraycopy(arr1,0,res,0,arr1.length);
        System.arraycopy(arr2,0,res,a1,arr2.length);
         String output ="";
         for(int i=0;i<res.length;i++) output+=res[i]+" ";
         System.out.println("Merged array: "+output);
         
    }
}