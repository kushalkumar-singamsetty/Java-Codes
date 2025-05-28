package programs;
import java.util.Scanner;
public class equals3 {
	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the three nos");
		int q=d.nextInt();
		int w=d.nextInt();
		int e=d.nextInt();
		if(q==w&&q==e) System.out.println("all nos are equal");
		else if(q!=w&&q!=e) System.out.println("all nos are not equal");
		else System.out.println("niether eual nor  diffferent");
	}
}
