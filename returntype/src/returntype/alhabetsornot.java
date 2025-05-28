package returntype;
import java.util.*;
public class  alhabetsornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(a>=65 &&a<=90||a>=97 &&a<=122) {
			System.out.println("alphabets");
		}
		else if(a>=48 &&a<=57){
			System.out.println("digits");
		}
		else {
			System.out.println(" special characters");
		}
	}
}
