package jspiders;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int a=o.nextInt();
		int c=a;
		int rev=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a/=10;
		}
		if(rev==c) System.out.println("palindrome");
	}

}
