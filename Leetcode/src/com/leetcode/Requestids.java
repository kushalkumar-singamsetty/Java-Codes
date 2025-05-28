package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Requestids {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String> ();
		l1.add("item3");
		l1.add("item2");
		l1.add("item1");
		l1.add("item2");
		l1.add("item3");
		List<String> output = getLatestKRequests(l1, 3);
		for(int i=0;i<output.size();i++) System.out.println(output.get(i));
	}
	public static List<String> getLatestKRequests(List<String> requests, int k)
	{
		ArrayList<String> res = new ArrayList<String>();
		String[] arr = new String[requests.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = requests.get(i);
		}
		res.add(arr[arr.length-1]);
		for(int i=arr.length-1;i>=0;i--)
		{
			String temp = arr[i];
			boolean flag = false;
			for(int j=0;j<res.size();j++)
			{
				String t = res.get(j);
				if(t.equals(temp))
				{
					 flag = true;
					 break;
				}
			}
			if(!flag) res.add(temp);
		}
		ArrayList<String> finalres = new ArrayList<String>();
		try
		{
			for(int j=0;j<k;j++) finalres.add(res.get(j));
		}
		catch(IndexOutOfBoundsException e)  
		{
		}
		
		return finalres;
	}  
}
