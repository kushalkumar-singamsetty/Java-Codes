package programs;
import java.util.Scanner;
public class swapping {
	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}
