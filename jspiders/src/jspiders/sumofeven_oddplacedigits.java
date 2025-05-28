package jspiders;
import java.util.Scanner;
public class sumofeven_oddplacedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=obj.nextInt(); int b=a;
		int count=0;
		int even=0,odd=0;
		for(int i=1;a>0;i++)
		{
			int rem=a%10;
			a/=10;
			count++;
			
		}
		for(int i=1;b>0;i++)
		{
			if(count%2!=0)
			{
				if(i%2==0) even+=b%10;
				else odd+=b%10;
				b/=10;
			}
			else  
			{ 
				if(i%2==0) odd+=b%10;
				else even+=b%10;
				b/=10;
			}
		}
		System.out.println("even "+even);
		System.out.println("odd  "+odd);
	}

}
