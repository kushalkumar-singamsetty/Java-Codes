package com.leetcode;

	public class commondigit 
	{
		static boolean findCommon(int a,int b,int c)
		{
			int r1,r2,r3;
		    while(a>0)
		    {
		    	r1=a%10;
		    	while(b>0)
		    	{
		    		r2=b%10;
		    		if(r1==r2)
		    		{
		    			while(c>0)
		    			{
		    				r3=c%10;
		    				if(r1==r3)
		    				{
		    					return true;
		    				}
		    				else
		    				{
		    					c=c/10;
		    				}
		    			}
		    		}
		    		else
		    		{
		    			b=b/10;
		    		}
		    	}
		    	a=a/10;
		    }
		    return false;
		}
	   public static void main(String[] args) {
		   int a=223;
		    int b=332;
		    int c=432;
		    boolean res1=findCommon(a,b,c);
		   if(res1==true)
		   {
			   System.out.println("yes");
		   }
		   else
		   {
			   System.out.println("no");
		   }
		  }
}