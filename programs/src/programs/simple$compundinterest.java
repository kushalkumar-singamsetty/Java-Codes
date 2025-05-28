package programs;
import java.util.Scanner;
public class simple$compundinterest {
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter the principal amount");
		long p=t.nextLong();
		System.out.println("enter the interest rate");
		double i=t.nextDouble();
		System.out.println("enter the years");
		int y=t.nextInt();
		double r=(i)/100;
		double x= (1+(r*y));
		double finalamount=p*x;
		System.out.println(finalamount);

	}
}
