package practice;
import java.util.Scanner;
public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=obj.nextInt(); int m=n/2;
		int stars=1;int spaces=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=stars;j++)
			{
				if(j==1||j==stars)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if(i<=n/2)
			{
				spaces--;
				stars+=2;
			}
			else
			{
				spaces++;
				stars-=2;
			}
		}

	}

}
