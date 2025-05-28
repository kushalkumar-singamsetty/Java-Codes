package programs;
import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		System.out.println("enter the M mo.");
		int m=t.nextInt();
		System.out.println("enter the N no.");
		int n=t.nextInt();
		int r=m+1;
		int w=n-1;
		for(;r<=w;r++) 
		{
			int a=0;
			for(int i=1;i<=r;i++)
			{
				if(r%i==0)
				{
					a++;
				}
			}
		if(a==2) System.out.println(r+ "prime no.");
		else if(a>2) System.out.println(r+ "Composite no.");
		else if(a==1) System.out.println(r+ "prime nor composite");
		}
			
		
	}

}
