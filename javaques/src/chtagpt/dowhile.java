package chtagpt;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		char a=e.next().charAt(0);
		char b=e.next().charAt(0);
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=b);
		
		
	}

}
