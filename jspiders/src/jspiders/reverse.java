package jspiders;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args)
	{
		Scanner l=new Scanner(System.in);
		int a=l.nextInt();
		int res=0;
		while(a>0)
		{
			res=res*10+a%10;
			a/=10;
		}
		System.out.print(res);
	}
}
