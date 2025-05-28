package chtagpt;
import java.util.Scanner;
public class denomination {
	long amount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		denomination obj1=new denomination();
		System.out.println("amount");
		obj1.amount=s.nextInt();
		if(obj1.amount>=2000)
		{
			long a=obj1.amount/2000;
			System.out.println("2000  X  "+a);
			obj1.amount=obj1.amount%2000;
		}
		if(obj1.amount>=500)
		{
			long a=obj1.amount/500;
			System.out.println("500	  X  "+a);
			obj1.amount=obj1.amount%500;
		}
		if(obj1.amount>=100)
		{
			long a=obj1.amount/100;
			System.out.println("100	  X  "+a);
			obj1.amount=obj1.amount%100;
		}
		if(obj1.amount>=50)
		{
			long a=obj1.amount/50;
			System.out.println("50 	  X  "+a);
			obj1.amount=obj1.amount%50;
		}
		if(obj1.amount>=20)
		{
			long a=obj1.amount/20;
			System.out.println("20 	  X  "+a);
			obj1.amount=obj1.amount%20;
		}
	}

}

