package returntype;

import java.util.Scanner;

public class alphaaandg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		while(a<=b) {
			if(a%10==3||a%10==4||a%10==5) {
				System.out.println((char)a);
			}
			a++;
		}
		
		 }

}
