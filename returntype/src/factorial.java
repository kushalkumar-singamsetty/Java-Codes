import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int count=1;
 
	    for(int i=1;i<=a;i++) {
	    	 count=i*count;
	    }
	    System.out.println(count);
	}

}
