package returntype;

public class Return {
	  public static void main(String[] args) { 
		  int k=90;
		  System.out.println(exp(k));
		     
		  }
		  public static int exp(int k) { 
		     
		    for (int i=1; i<=3;i++) { 
		       k=k*i; 
		        
		    } 
		     
		    return k; 
		  }

	 }
