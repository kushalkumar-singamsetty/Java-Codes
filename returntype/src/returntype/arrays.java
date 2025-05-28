package returntype;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		 int a[]=new int[10];//boundary of the array is fixed 
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the arraysize n-1");
		 int n=s.nextInt(); //length of the array os given(n)
		 System.out.println("--------");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();//elements of the array through indexing is given 
		 }
		 System.out.println("--------");
			 for(int i=0;i<n;i++) 
			 {
				 
			 System.out.println(a[i]);
		 }
	}

}
