package programs;
import java.util.Scanner;
public class neonno {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=obj.nextInt();
		int b=obj.nextInt();
		for(;a<=b;a++) {
		int power=a*a;
		int sum=0;
		while(power>0)
		{
			int rem=power%10;
			power/=10;
			sum+=rem;
		}
		if(sum==a) System.out.println(sum+"NEON NO");
	}
	}
}
