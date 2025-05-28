package jspiders;
import java.util.Scanner;
public class primenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		int m=t.nextInt();// m+=1;
		int n=t.nextInt(); //n-=1;
		for(;m<=n;m++)
		{
			boolean flag=true;
			for(int i=2;i<=m/2;i++)
			{
				if(m%i==0)
				{
					flag=false;
					break;
				}
			}
			if(m<=1) System.out.print("");
			else if(flag) System.out.print(m+" ");
		}
	}

}
