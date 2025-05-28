package returntype;

import java.util.jar.JarException;

public class exceptionhandling {
	public static void main(String[] args) {
		try
		{
		int  a=56/0;
		System.out.println("hi");
		}
		catch(Exception k){
			System.out.println(k); 
			System.out.println("hello");
		}
		finally {
			System.out.println("bye");
		}
	}
}
