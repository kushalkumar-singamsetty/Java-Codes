package programs;
import java.util.Scanner;
public class perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=obj.nextInt();
		int w=obj.nextInt();
		for(;n<=w;n++) {
			int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(sum+ "perfect Square");
		}
		}
	}

}
