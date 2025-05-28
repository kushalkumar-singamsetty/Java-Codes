package allprgms;
import java.util.Scanner;
public class prgms {
public static void main (String[] args) {
	 Scanner s=new Scanner(System.in);
	  int wallet=s.nextInt();
	  System.out.println("entered wallet amount " + wallet);
 	int transfer=s.nextInt();
 	System.out.println("entered transfer amount "  +transfer);
 	if (transfer<=wallet) {
 		System.out.println(" amount is tranfarable");
 	}
 	else {
 		System.out.println(" amount is not tranfarable");
 	}
 	System.out.println( "ramaining amount"+  (wallet - transfer));
	 
}
}
