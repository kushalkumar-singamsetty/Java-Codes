package jspiders;
import java.util.Scanner;	//return is keyword that stops the current method and returns to the main method
public class primeno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=s.nextInt();
		if(a<=1) {System.out.println("neither prime nor composite");
		return;}
		boolean flag=true;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0) {
				flag=false ;
				break;
			}
				
		}
		if(flag) System.out.println("Prime no");
		else System.out.println("composite no.");
	}

}
