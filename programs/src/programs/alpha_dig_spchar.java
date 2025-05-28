package programs;
import java.util.Scanner;
public class alpha_dig_spchar {
	public static void main(String[] args)
	{
		Scanner i=new Scanner(System.in);
		for(int k=0;k<=3;k++) 
		{
			char a=i.next().charAt(0);
			if(a>=65&&a<=90||a<=122&&a>=97)
			{
				System.out.println(" a is alphabet");
			}
			else if(a>=48&&a<=57)
			{
				System.out.println("a is digit");
			}
			else
			{
				System.out.println("a is special character");
			}
		}
	}
}
