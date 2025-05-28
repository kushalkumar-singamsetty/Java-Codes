package jspiders;
import java.util.Scanner;
public class automorphicno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(), b=a;
		int power=a*a;
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		int res=0,j=1;
		for(int i=1;i<=count;i++)
		{
			int rem=power%10;
			res=res+(rem*j);
			j*=10;
			power/=10;
		}
		if(res==b) System.out.println("automorphic");
		else System.out.println("not automorphic");
	}

}
