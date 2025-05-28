package programs;
import java.util.Scanner;
public class prime1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the nos");
		int a=s.nextInt();
		int b=s.nextInt();
		for(;a<=b;a++) 
		{
			int v=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
					v++;
			}
			if(v==2) System.out.println(a);
		}
	}

}
