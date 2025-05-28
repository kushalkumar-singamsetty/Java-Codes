package programs;
import java.util.Scanner;
public class armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the no.");
		int t=q.nextInt();
		int r=q.nextInt();
		for(;t<=r;t++) {
			int a=t;
			int b=t;
			int count=0;
			int res=0;
			while(a>0)
			{
				a=a/10;
				count++;
			}
			while(b>0)
			{
				int rem2=b%10;
				int power=1;
				for(int i=1;i<=count;i++)
				{
					power=power*rem2;
				}
				res+=power;
				b=b/10;
			}
			if(res==t)
			{
				System.out.println("Armstrong number"+res);
			}
		}
	}

}
