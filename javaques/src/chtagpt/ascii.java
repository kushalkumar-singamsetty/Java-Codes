package chtagpt;
import java.util.Scanner;
public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		char m=d.next().charAt(0);
		char n=d.next().charAt(0);
		while(m<=n)
		{
			if(m>=65&&m<=90||m>=97&&m<=122)
			{
			if((char)m%10==3||(char)m%10==5||(char)m%10==4)
			{
				System.out.println(m);
			}
			}
			m++;
		}
	}

}
