package returntype;
import java.util.Scanner;
public class aavanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner p=new Scanner(System.in);
	  int a=p.nextInt();//10
	  int b= p.nextInt();//20
	  int c=a+b;//30
	  a=c-a;//30-20
	  b=c-b;//30-10
	  System.out.println(a);//20
	  System.out.println(b);//10
	}

}
