package jspiders;
import java.util.Scanner;
public class fibanocciseriesofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		int a=t.nextInt();
		int b=t.nextInt();
		int n=t.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;b=c;
		}
	}

}
