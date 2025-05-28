package programs;
import java.util.Scanner;
public class tablesm$n {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting no.");
		int m=s.nextInt();
		System.out.println("Enter the ending no.");
		int n=s.nextInt();
		int i=m+1;
		int k=n-1;
		for(;i<=k;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int a=i*j;
				if(j<=9) System.out.println(i+" "+"*"+" "+j+"  "+"=" +a);
				else System.out.println(i+" "+"*"+" "+j+" =" +a);
			}
			System.out.println("----****----");
		}
	}
}
