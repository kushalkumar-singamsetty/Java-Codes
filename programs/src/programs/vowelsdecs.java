package programs;
import java.util.Scanner;
public class vowelsdecs {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println(" 1. Consonants    2. Vowels");
		int a =obj.nextInt();
		switch(a)
		{
		case 1: System.out.println("B,C,D,F,G,H,I,J,K,L,M,N,P,Q,R,S,T,V,W,X,Y,Z"); break;
		case 2: System.out.println("A,E,I,O,U");
		}
	}

}
