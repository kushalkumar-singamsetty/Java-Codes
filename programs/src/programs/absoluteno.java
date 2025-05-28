package programs;
import java.util.Scanner;
public class absoluteno {
	public static void main(String[] args)
	{
		Scanner f=new Scanner(System.in);
		System.out.println("enter the no");
		int a=f.nextInt();
		if(a<0)
		{
			System.out.println(-a);
		}
		else
		{
			System.out.println(a);
		}
	}
}
