package patterns;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
