package package1;

import java.util.Scanner;

public class normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		int b=s.nextInt();
		int c=0;
		while(a<=b) {
			 c++;
			 a++;
		}
		System.out.println(c);
	}

}
