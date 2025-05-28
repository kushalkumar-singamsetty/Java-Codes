package chtagpt;
import java.util.Scanner;
public class mandn {
	static int m;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u=new Scanner(System.in);
		System.out.println("enter the nos.");
		mandn.m=u.nextInt();
		mandn.n=u.nextInt();
		System.out.print("even nos :");
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print (i+" ");
			}
		}
		System.out.println(" ");
		System.out.print("odd nos :");
		for(int i=m;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.print (i+" ");
			}
		}
		System.out.println(" ");
		
	}

}
