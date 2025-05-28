package programs;
import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the nos.");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int large=0;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				 large=i;
			}
		}
		System.out.println("hcf of "+a+" and "+ b+"is "+large);
	}

}
