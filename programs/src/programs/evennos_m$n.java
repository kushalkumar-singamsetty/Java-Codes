package programs;
import java.util.Scanner;
public class evennos_m$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter m and n nos ");
		int m=s.nextInt();
		int n=s.nextInt();
	
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
			}
		}
		System.out.println();
		for(int j=m;j<=n;j++)
		{
			if(j%2==1)
			{
				System.out.print(j);
			}
		}
	}

}
