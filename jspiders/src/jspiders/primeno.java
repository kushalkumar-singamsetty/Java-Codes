package jspiders;
import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 2 nums");
		int m=obj.nextInt();
		int n=obj.nextInt();
		for(int i=m;i<=n;i++)
		{
			int count=0;
			if(i<=1) continue;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) System.out.println(i);
		}
		 
	}

}
