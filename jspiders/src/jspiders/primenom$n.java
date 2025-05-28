package jspiders;
import java.util.Scanner;
public class primenom$n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		System.out.println("ENTER THE M & N NOS.");
		int m=t.nextInt(); m+=1;
		int n=t.nextInt(); n-=1;
		int count=0;
		for(int i=2;i<=m/2;i++)
		{
			if(m%i==0) count++; 
		}
		if(count==0) System.out.println("prime");
	}
		
}
