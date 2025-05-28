package jspiders;
import java.util.Scanner;
public class primeno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=obj.nextInt();
		if(a<=1) {
			System.out.println(a+" is neither prime nor composite");
			return;
		}
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println(a+ " composite no.");
				return;
			}
		}
		System.out.println(a+" prime no.");
		
	}

}
