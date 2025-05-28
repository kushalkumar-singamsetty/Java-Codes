package programs;
import java.util.Scanner;
public class telephonicbills {
	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter the no of calls");
		int a=r.nextInt();
		int b=0;
		if(a<=100)
		{
			System.out.println("your bill is Rs.200");
		}
		else if(a>=100&&a<=150)
		{
			b=a-100;
			System.out.println("your bill is Rs."+ (200+b*0.60));
		}
		else if(a>=150&&a<=200)
		{
			b=a-150;
			System.out.println("your bill is Rs."+ (200+b*0.50));
		}
		else if(a>200)
		{
			b=a-200;
			System.out.println("your bill is Rs."+ (200+b*0.40));
		}
	}
}
