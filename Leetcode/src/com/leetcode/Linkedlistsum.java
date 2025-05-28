package com.leetcode;

public class Linkedlistsum {
	ListNode first=null;
	private int count=0;
	public void add(int ele)
	{
		if(first==null)
		{
			first=new ListNode(ele,null);
			count++;
			return;
		}
		ListNode curr = first;
		while(curr.next!=null) curr = curr.next;
		curr.next = new ListNode(ele,null);
		count++;
	}
	public int getElement(int index)
	{
		if(index>=count||index<0)
		{
			throw new IndexOutOfBoundsException();	
		}
		if(index==0) return first.val;
		ListNode curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.val;
	}
	public int addTwoLists(ListNode l1, ListNode l2)
	{
		ListNode curr1 =l1;
		ListNode curr2 =l2;
		int a,b;
		while(curr1.next!=null)
		{
			curr1 = curr1.next;
		}
		a=curr1.val;
		while(curr2.next!=null)
		{
			curr2 = curr2.next;
		}
		b=curr2.val;
		return a+b;
	}
}
