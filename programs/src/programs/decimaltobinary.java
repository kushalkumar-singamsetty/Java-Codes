package programs;
import java.util.Scanner;
public class decimaltobinary {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the num");
		int a=obj.nextInt();
		int i=1;
		int res=0;
		while(a>0)
		{
			int rem=a%2;
			a/=2;
			res=(rem*i)+res;
			i*=10;
		}
		System.out.println(res);
		
	}
}
