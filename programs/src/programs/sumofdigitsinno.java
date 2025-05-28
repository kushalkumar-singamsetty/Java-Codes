package programs;
import java.util.Scanner;
public class sumofdigitsinno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p=new Scanner(System.in);
		System.out.println("enter the no");
		long a=p.nextLong();
		int sum=0;
		while(a>0)
		{
			long rem=a%10;
			a/=10;
			sum+=rem;
		}
		System.out.println(sum);
	}

}
