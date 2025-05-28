package programs;
import java.util.Scanner;
public class smallest {
	public static void main(String[] args)
	{
		Scanner w=new Scanner(System.in);
		System.out.println("enter the two nos");
		int a=w.nextInt();
		int b=w.nextInt();
		if(a<b) System.out.println("a is smaller");
		else System.out.println("b is smaller");
		
	}
}
