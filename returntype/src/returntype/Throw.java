package returntype;

public class Throw {
	 public static void main(int a){
			if(a>18)
			{
				throw new ArithmeticException("hii");
			}
			else
				System.out.println("hello");
			 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 main(25);
	}

}
