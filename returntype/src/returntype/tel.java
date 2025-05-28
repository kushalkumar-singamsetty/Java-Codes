package returntype;

import java.util.Scanner;

public class tel {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int k=s.nextInt();
	 int b=s.nextInt();
	 System.out.print(n);
	 int d=1;
	   for(int i=0;i<=b;i++) { 
		   int y=n*d;
		   d=y;
		   System.out.print(" ");
		 System.out.print(y);
		   
	 }
	}

}
