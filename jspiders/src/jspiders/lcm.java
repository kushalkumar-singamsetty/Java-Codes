package jspiders;
import java.util.Scanner;
public class lcm {	//lcm means  no. that is div by given no.then no.ismultiple of given no.//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 2 nos.");
		int a=s.nextInt();
		int b=s.nextInt();
		int i=a>b?a:b;
		int c=i;
		while(a>0)
		{
			if(i%a==0&&i%b==0)
			{
				System.out.println(i);
				break;
			}
			i+=c;
		}
	}

}
