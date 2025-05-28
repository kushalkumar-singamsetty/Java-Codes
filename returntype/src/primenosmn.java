import java.util.Scanner;
public class primenosmn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	    for(;a<=b;a++) {
	    	int count=0;
	    	for(int i=1;i<=a;i++) {
	    		if(a%i==0) {
	    			count++;
	    		}
	    	}
	    	if(count==1) {
	    		System.out.println(a+"prime nor composite");
	    	}
	    	else if(count<=2)
		{
			System.out.println(a+"prime");
		}
		 else {
			  System.out.println(a+"not prime");
			  }
	}
	}

}
