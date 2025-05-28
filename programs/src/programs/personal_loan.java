package programs;
import java.util.Scanner;
public class personal_loan 
{
	static int credit1=4500;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your credit Score");
		int credit2=s.nextInt();
		System.out.println("Enter your age");
		int age=s.nextInt();
		if(personal_loan.credit1==credit2&&age>=21&&age<=80)
		{
			System.out.println("ELIGIBLE FOR LOAN");
		}
		else System.out.println("NOT ELIGIBLE");

	}
}
