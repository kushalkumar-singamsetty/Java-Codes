package programs;
import java.util.Scanner;
public class powerofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=obj.nextInt();
		System.out.println("enter the no.");
		int b=obj.nextInt();
		System.out.println("enter the power");
		int n=obj.nextInt();
		for(;a<=b;a++) {
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=power*a;
			
		}
		System.out.println(a+"^"+n+"= "+ power);
		}
				
	}

}
