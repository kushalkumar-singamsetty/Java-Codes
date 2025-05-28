import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner p=new Scanner(System.in);
		  int a=p.nextInt(); 
		  int b= p.nextInt(); 
		  char c= p.next().charAt(0); 
		  switch (c) {
		  case '+':{
			  System.out.println(a+b);	
			  break;}
		  case '-':{
			  System.out.println(a-b);
			  break;	  
		  }
		  case '*':{
			  System.out.println(a*b);
			  break;
		  }
		  case '/':{
			  System.out.println(a/b);
			  break;
		  }
		  case '%':{
			  System.out.println(a%b);
			  break;
		  }
		  default: System.out.println("No char");
		  
	}
	}

	}


