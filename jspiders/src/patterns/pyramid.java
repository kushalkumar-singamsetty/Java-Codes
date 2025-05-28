package patterns;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j<i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1) break; 
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=n;j++)
			{
				if(i==1) break;
				if(i+j<n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
