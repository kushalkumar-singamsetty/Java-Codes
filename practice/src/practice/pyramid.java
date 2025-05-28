package practice;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=obj.nextInt();
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			int spaces=n-i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=stars;j++)
			{
				if(j==1||j==stars||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			spaces--;
			stars+=2;
		}
	}

}
