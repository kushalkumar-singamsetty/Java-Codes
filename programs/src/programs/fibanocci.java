package programs;
import java.util.Scanner;
public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=0;
		int end=obj.nextInt();
		for(int i=1;i<=end;i++) {
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
			System.out.print(" ");
			
		}
	}

}
