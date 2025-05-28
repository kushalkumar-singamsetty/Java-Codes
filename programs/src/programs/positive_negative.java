package programs;
import java.util.Scanner;
public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		for(int i=0;i<4;i++) {
		int a=t.nextInt();
		if(a>0) System.out.println("positive");
		else if(a<0) System.out.println("negative");
		else System.out.println("Zero");
		}
	}

}
