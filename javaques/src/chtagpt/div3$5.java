package chtagpt;
import java.util.Scanner;
public class div3$5 {
	int m;
	int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f=new Scanner(System.in);
		div3$5 obj=new div3$5();
		System.out.println("enter the two nos.");
		obj.m=f.nextInt();
		obj.n=f.nextInt();
		while(obj.m<=obj.n)
		{
			if(obj.m%3==0&&obj.m%5==0)
			{
				System.out.println(obj.m);
			}
			obj.m++;
		}
		
	}

}
