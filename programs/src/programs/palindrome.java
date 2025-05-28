package programs;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the number");
		int a=s.nextInt();
		int c=a;
		int res=0;
		while(a>0)
		{
			int rem=a%10;
			res=res*10+rem;
			a=a/10;
	}
		if(res==c)
		System.out.print(c+"palindrome");
		else System.out.print(c+"not palindrome");
	}

	
	

}
