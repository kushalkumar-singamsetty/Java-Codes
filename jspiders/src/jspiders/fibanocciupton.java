package jspiders;
import java.util.Scanner;
public class fibanocciupton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;int b=1;
		for(int i=a;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;b=c;
			if(a>n) break;
		}
	}

}
