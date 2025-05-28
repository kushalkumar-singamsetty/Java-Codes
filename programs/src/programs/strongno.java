package programs;
import java.util.Scanner;
public class strongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int c=sc.nextInt();
		int b=a;
		for(;b<=c;b++)
		{
			int sum=0;
			int d=b;
			while(d>0)
			{
				int rem=d%10;
				d=d/10;
				int fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;
					
				}
				sum+=fact;
			}
			if(sum==b) System.out.println(b+"STRONG NUMBER");
		}
	}
}
