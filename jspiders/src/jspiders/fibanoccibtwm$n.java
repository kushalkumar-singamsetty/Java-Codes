package jspiders;
import java.util.Scanner;
public class fibanoccibtwm$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int a=d.nextInt(),b=d.nextInt();
		int m=d.nextInt();
		int n=d.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(a>=m&&a<=n)
				System.out.print(a+" ");
			int c=a+b;
			a=b;b=c;
		}
	}

}
