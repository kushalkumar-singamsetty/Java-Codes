package programs;
import java.util.Scanner;
public class swappingab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=d.nextInt();
		System.out.println("Enter the b value");
		int b=d.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		/*int c=a;
		a=b;
		b=c;*/
		System.out.println(a);
		System.out.println(b);
	}

}
