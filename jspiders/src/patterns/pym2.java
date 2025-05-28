package patterns;

import java.util.Scanner;

public class pym2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=(n+1)/2; int k=m/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
					System.out.print("* ");
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
