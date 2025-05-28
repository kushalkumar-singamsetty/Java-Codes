package jspiders;
import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 2 nos.");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=a>b?a:b;
		int large=0;
		for(int i=1;i<=c;i++)
		{
			if(a%i==0&&b%i==0)
			{
				if(i>large) large=i;
			}
		}
		System.out.println(large);
	}

}
