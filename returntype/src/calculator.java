import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner p=new Scanner(System.in);
		  int a=p.nextInt(); 
		  int b= p.nextInt(); 
		  char c= p.next().charAt(0); 
		  switch (c) {
		  case 43:{
			  System.out.println(a+b);	
			  break;}
		  case 45:{
			  System.out.println(a-b);
			  break;	  
		  }
		  case 42:{
			  System.out.println(a*b);
			  break;
		  }
		  case 47:{
			  System.out.println(a/b);
			  break;
		  }
		  case 37:{
			  System.out.println(a%b);
			  break;
		  }
		  default: System.out.println("No char");
		  
	}
	}
}


