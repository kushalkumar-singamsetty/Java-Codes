package jspiders;
import java.util.Scanner;
public class sumd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); int even=0,odd=0;
		int rev=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a/=10;
		}
		System.out.println(rev);
		for(int i=1;rev>0;i++)
		{
			if(i%2==0) {
				even+=rev%10;
			}
			else 	{
				odd+=rev%10;
			}
			rev/=10;
		}
		System.out.println("even  "+even);
		System.out.println("odd   "+odd);
	}

}
