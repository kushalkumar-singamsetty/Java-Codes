package programs;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int a=o.nextInt(); 
		int c=1;
		while(a>0)
		{
			c=c*a;
			if(a>1) System.out.print(a+"*");
			else if(a==1) 	System.out.print("1");
			a=a-1;
		}
		System.out.print("="+c);
		System.out.println(" ");
/*-------------------------------------------------------------------*/ 
		int b=o.nextInt(); 
		int d=1;
		String s="";
		for(int i=1;i<=b;i++)
		{
			d=d*i;
			s+=i;
			if(i<b)
				s=s+"*";
		}
		System.out.println(s+"="+d);
	}
	

}
