package patterns;
import java.util.Scanner;
public class pt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt(); int m=(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=n&&j==1)
					System.out.print("L ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
