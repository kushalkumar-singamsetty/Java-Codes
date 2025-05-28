package programs;

import java.util.Scanner;

public class hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	       int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int sum=a;
	            String s="";
	            for(int j=0;j<n;j++)
	            {
	                int pow=(int)Math.pow(2,j);
	                sum=sum+pow*b;
	                System.out.print (sum+" ");
	            }
	            System.out.println();
	        }
	
	        }
	}


