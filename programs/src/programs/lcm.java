package programs;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the nos");
		int a=s.nextInt();
		int b=s.nextInt();
		int n=a>b?a:b;
		int c=n;
		while(n>0)
		{
			if(n%a==0&&n%b==0)
			{
				System.out.println("lcm of"+a+"and "+ b+ "is"+n);
				break;
			}
			n=n+c;
		}
		
	}

}
