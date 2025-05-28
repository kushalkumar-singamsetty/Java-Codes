package programs;
import java.util.Scanner;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=s.nextInt();
		String b="";
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				b+=i;
				b+=" ";
			}
		}
		System.out.println("factors of "+ a +" is "+ b );
	}

}
