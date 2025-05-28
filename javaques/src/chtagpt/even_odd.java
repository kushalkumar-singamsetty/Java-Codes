package chtagpt;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Enter starting no.");
		int i=e.nextInt();
		System.out.println("Enter ending no.");
		int t=e.nextInt();
		int even=0;
		int odd=0;
		for(;i<=t;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
