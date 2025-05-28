package jspiders;
import java.util.Scanner;
public class sumofeven_odddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=s.nextInt();
		int even=0,odd=0;
		while(a>0)
		{
			int rem=a%10;
			if(rem%2==0) even+=rem;
			else odd+=rem;
			a/=10;
		}
		System.out.println("sum of even digits is "+even);
		System.out.println("sum of odd digits is "+odd);
	}

}
