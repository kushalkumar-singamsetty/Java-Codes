package programs;
import java.util.Scanner;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		long a=obj.nextLong();
		long res=0;
		int i=1;
		while(a>0)
		{
			res+=(a%10*i);
			a/=10;
			i*=2;
		}
		System.out.println(res);
	}

}
