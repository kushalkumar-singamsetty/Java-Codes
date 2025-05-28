package chtagpt;
import java.util.Scanner;
public class sumofnos {
	int n;
	int e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sumofnos obj=new sumofnos();
		System.out.println("enter starting no.");
		obj.n=sc.nextInt();
		System.out.println("enter ending no.");
		obj.e=sc.nextInt();
		int sum=0;
		int avg=0;
		for(;obj.n<=obj.e;obj.n++)
		{
			sum=sum+obj.n;
			avg++;
		}
		System.out.println(sum);
		System.out.println(avg);
		double d=sum/avg;
		System.out.println(d);
	}

}
