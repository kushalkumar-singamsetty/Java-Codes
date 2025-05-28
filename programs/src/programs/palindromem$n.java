package programs;
import java.util.Scanner;
public class palindromem$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y=new Scanner(System.in);
		int m=y.nextInt(); 
		int n=y.nextInt();
		for(;m<=n;m++) {
		int res=0;
		int a=m;
		int c=m;
		int rem=0;
		while(a>0)
		{
			rem=a%10;
			res=res*10+rem;
			a=a/10;
		}
		if(c==res) { System.out.print (res);
		System.out.print (" ");}
	}
	}
}
