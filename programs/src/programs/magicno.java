package programs;
import java.util.Scanner;
public class magicno {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=obj.nextInt(),b=a,res;
		do { 
			res=0;
			while(a>0)
			{
				res+=a%10;
				a/=10;
			}
			a=res;
			System.out.println(res);
		}
		while(res>9);
		if(res==1) System.out.println("magic no"+b);
		else System.out.println("not a magic no"+b);
	}
}
