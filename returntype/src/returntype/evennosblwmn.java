package returntype;

import java.util.Scanner;

public class evennosblwmn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=0;
		int d=0;
		while(a<=b) {
			if(a%2==0) {
				c++;
			}
			else {
				d++;
			}
			a++;
		}
		System.out.println(c);
		System.out.println(d);
		
	}

}
