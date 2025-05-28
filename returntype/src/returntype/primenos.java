package returntype;
import java.util.Scanner;
public class primenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int count=0;
		     for(int i=1;i<=a;i++) {
		    	 if(a%i==0) {
		    		 count++;
		    	 }
		     }
		    if(count==1) {
		    	System.out.println("prime nor composite");
		    }
		    else if(count<=2)
			{
				System.out.println("prime");
			}
			 else {
				  System.out.println("not prime");
				  }
		    	
		    }
		     
		    	

	
}
