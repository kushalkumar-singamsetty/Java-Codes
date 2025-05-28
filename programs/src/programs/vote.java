package programs;
import java.util.Scanner;
public class vote {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("ENter your age");
		int age=obj.nextInt();
		if(age>=18&&age<=50) System.out.println("you are eligible to vote and donate blood");
		else if(age<18)
			{
				int i=18;
				int u=18-age;
				System.out.println("Sorry ,not eligible  " + "wait for " + u +"years");
			}
		else 
			System.out.println("Sorry ,not eligible");
			
	}
}
