package jspiders;
import java.util.Scanner;
public class strongnom$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(;a<=b;a++) {
		int c=a;int res=0;
		while(c>0)
		{
			int r=c%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			res+=fact;
			c/=10;
		}
		if(res==a) System.out.println("strong no"+res);
		}
	}

}
