package practice;
import java.util.Scanner;
public class swastik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==m||j==m)||(i==1&&j<=m)||(i==n&&j>=m)||(j==1&&i>=m)||(j==n&&i<=m))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
