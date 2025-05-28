package jspiders;
import java.util.Scanner;

public class Hcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the 2 nos.");
		int m=obj.nextInt();
		int n=obj.nextInt();
		int b=obj.nextInt();
		int i=m>n?m:n;
		int a=i,large=0; 
		while(i<=b)
		{
			if(i%m==0&&i%n==0)
			{
				large=i;
			}
			i+=a;
		}
		System.out.println(large);
	}

}
