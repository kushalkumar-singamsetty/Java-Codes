package programs;
import java.util.Scanner;
public class inc_dec {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter the 3 nos.");
		int r=x.nextInt();
		int t=x.nextInt();
		int y=x.nextInt();
		if((t==r+1)&&(y==t+1)) System.out.println("increasing order");
		else if((t==r-1)&&(y==t-1))	System.out.println("decreasing order");
		else System.out.println("niether increasing nor decreasing");
	}
}
