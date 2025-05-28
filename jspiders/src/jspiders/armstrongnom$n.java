package jspiders;
import java.util.Scanner;
public class armstrongnom$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		for(int c=a;c<=b;c++)
		{
			int i=c;int m=i;
			int count=0;
			while(i>0)
			{
				i/=10;
				count++;
			}
			int res=0;
			while(m>0)
			{
				int r=m%10;
				int power=1;
				for(int j=1;j<=count;j++)
				{
					power=power*r;
				}
				res=res+power;
				m/=10;
			}
			if(res==c) System.out.println(res+"armstrongno");
		}
	}

}
