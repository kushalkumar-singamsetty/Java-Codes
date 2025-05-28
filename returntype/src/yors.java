import java.util.Scanner;

public class yors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int temp=a;
	    int res=0;
	    while(a>0) {
	    	int rem=a%10;
	    	res=res*10+rem;
	    	a=a/10;    }
	    if(res==temp)
	    System.out.println("Palindrome");
	    else {
	    	System.out.println("not palindrome");
	    }
	}

}
