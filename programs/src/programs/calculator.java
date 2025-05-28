package programs;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("Enter the  operator");
		char c=obj.next().charAt(0);
			switch(c)
			{
				case '+': System.out.println(a+b); break;
				case '-': System.out.println(a-b);break;
				case '*': System.out.println(a*b);break;
				case '/': System.out.println(a/b);break;
				case '%': System.out.println(a%b);
				
			}
	}
}
