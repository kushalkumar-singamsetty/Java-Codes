package programs;
import java.util.Scanner;
public class password {
	static int password1=1225;
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the password");
		int password2=obj.nextInt();
		if(password.password1==password2)
		{
			System.out.println("matched");
		}
		else System.out.println("not matching");
	}
}
