import java.util.Scanner;

public class palindrome{
	 public static void main(String args[]){ 
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int res=0;
		    int sum=a;
		    while(a>0) {
		    	int rem=a%10;
		    	res=res*10+rem;
		    	a=a/10;
		    }
		    if(res==sum)
		    	System.out.println("palindrome");
		    else {
		    	System.out.println(" not palindrome");
		    }
	 }
}
		  