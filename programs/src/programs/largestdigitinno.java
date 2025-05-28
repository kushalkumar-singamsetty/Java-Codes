package programs;
import java.util.Scanner;
public class largestdigitinno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=s.nextInt();
		int res1=0;
		while(a>0)
		{
			int rem1=a%10;
			if(rem1>res1)  res1=rem1;
			a/=10;
		}
		 System.out.println(res1+"is large");
	}

}
