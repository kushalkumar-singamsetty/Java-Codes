package programs;
import java.util.Scanner;
public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the no.");
		long a=d.nextInt();
		while(a>0)
		{
			long b=a%10;
			a=a/10;
			System.out.print(b);
		}
	}

}
