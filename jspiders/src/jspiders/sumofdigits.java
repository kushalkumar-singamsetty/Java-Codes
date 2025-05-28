package jspiders;
import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=e.nextInt();
		int sum=0;
		while(a>0)
		{
			sum+=a%10;
			a/=10;
		}
		System.out.println("sum of the digits is  "+sum);
	}

}
