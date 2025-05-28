package practice;
import java.util.Scanner;
public class spacediamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=obj.nextInt();
		int m=(n+1)/2;int spaces=1;int stars;
		for(int i=1;i<=n;i++)
		{
			if(i<m)
			{
				stars=m-i;
			}
			else
				stars=i-m;
			for(int j=1;j<=stars;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i>n/2)
			{
				spaces-=2;
				stars++;
			}
			else
			{
				spaces+=2;
				stars--;
			}
		}
	}

}
