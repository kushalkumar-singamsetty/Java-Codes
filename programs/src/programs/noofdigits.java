package programs;
import java.util.Scanner;
public class noofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=obj.nextInt();
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			a=a/10;
			sum++;
		}
		System.out.println(sum);
	}

}
