package chtagpt;
import java.util.Scanner;
public class looops {
	int a;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		looops obj=new looops();
		System.out.println("enter the  no");
		obj.a=d.nextInt();
		obj.b=d.nextInt();
		int c=0;
		while(obj.b>=obj.a)
		{
			System.out.println(obj.b);
			obj.b--;
		}
	}

}
