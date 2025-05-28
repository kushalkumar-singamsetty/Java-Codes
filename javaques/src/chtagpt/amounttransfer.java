package chtagpt;
import java.util.Scanner;
public class amounttransfer {
	long a;
	long t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		amounttransfer obj=new amounttransfer();
		for(int i=0;i<=2;i++) 
		{
		System.out.println("enter the amount to enter into wallet");
		obj.a=d.nextLong();
		System.out.println("amount to be transferred");
		obj.t=d.nextLong();
			if(obj.a>=obj.t)
			{
				long b=obj.a-obj.t;
				System.out.println("amount is transferred");
				System.out.println("remianing balance:  "+b);
			}
			else
			{
				System.out.println("amount cannot be transferred");
			}
		}

	}

}
