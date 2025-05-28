import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int amount= s.nextInt();
		int interest=s.nextInt();
		int k=amount+(amount*interest/100)/4;
		System.out.println(k);
	}
}
