package chtagpt;
import java.util.Scanner;
public class largest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("enter the nos");
		int a=d.nextInt();//2
		int b=d.nextInt();//3
		int c=d.nextInt();//4
		if(a>b)//2>3
		{
			if(a>c) System.out.println("a is larger");
			else System.out.println("c is larger");
		}
		if(b>a)//2>3
		{
			if(b>c) System.out.println("b is larger");
			else System.out.println("c is larger");
		}
		else System.out.println("c is larger");
	}

}
