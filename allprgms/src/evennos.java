import java.util.Scanner;

public class evennos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  no");
		int k=s.nextInt();
		int b=s.nextInt();
		int c=0;
		int d=0;
		if(k>b) {
			System.out.println( "invalid range");
		}
		while(k<=b) {
			 
			if(!(k%2==0)) {
			 c++;
			}
			else
			{
				d++;
			}
			 
			k++;
		}
		System.out.println("odd nos"+c);
		System.out.println("even nos"+d);
		}
	}


