package chtagpt;
import java.util.Scanner;
public class largestno {
	 int f;
	 int g;
	 int h;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		largestno obj=new largestno();
		System.out.println("enter the nos");
		int i=0;
		while(i<2)
		{
			System.out.println("enter the nos");
			obj.f=sc.nextInt();
			obj.g=sc.nextInt();
			obj.h=sc.nextInt();
			if(obj.f>obj.g&&obj.f>obj.h)
			{
				System.out.println(obj.f + " f is greater");
			}
			else if(obj.h>obj.g&&obj.h>obj.f)
			System.out.println(obj.h+" h is greater ");
			else
			{
				System.out.println(obj.g+" g is greater ");
			}
			i++;
		}
		
	}

}
