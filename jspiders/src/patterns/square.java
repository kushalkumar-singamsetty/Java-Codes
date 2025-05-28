package patterns;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(i==1||i==20||j==1||j==20)
				 System.out.print("X");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
