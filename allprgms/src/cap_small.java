import java.util.Scanner;
public class cap_small {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char k=s.next().charAt(0);
		if(k>=65&&k<=90){
			 System.out.println((char)(k+32));
			}
		else if(k>=97&&k<=122)
		{
			 System.out.println((char)(k-32));
		}
		else
		{
			 System.out.println("not an alphabeta");
		}
	}

}
