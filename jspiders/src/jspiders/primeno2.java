package jspiders;
import java.util.Scanner;
public class primeno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=obj.nextInt();
		boolean flag=true;
		if(a<=1) 
		{
			System.out.println("NIETHER PRIME NOR COMPOSITE");
		}
		else 
		{
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					System.out.println("Composite no.");
					flag=false;
					break;
				}
			}
			if(flag) System.out.println("Prime");
			
		}
		
	}

}
