package programs;
import java.util.Scanner;
public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=r.nextInt();
		int n=r.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=i*a;
			if(i<=9) System.out.println(a+" "+"*"+i+" "+"="+k);
			else    System.out.println(a+" "+"*"+i+ "="+k);
		}
	}

}
