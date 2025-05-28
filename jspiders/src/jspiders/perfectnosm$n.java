package jspiders;
import java.util.Scanner;
public class perfectnosm$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		for(;a<=b;a++)
		{
			int sum=0;
			for(int i=1;i<=a/2;i++)
			{
				if(a%i==0) sum+=i;
					
			}
			if(sum==a) System.out.println("perfectno"+sum);
		}
	}
}
