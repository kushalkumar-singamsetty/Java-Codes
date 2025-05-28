package patterns;
import java.util.Scanner;
public class hollowpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(i-1);j++)
			{
				if(i==n||j==1||j==2*(i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
