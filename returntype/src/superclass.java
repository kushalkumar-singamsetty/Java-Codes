 
//super keyword is used when we give same variable names/same methods then jvm gets confused so we use it
//here we have same var names in pr&ch classes so for accessing n in pr class we use duper in ch class
//super keyword is always used in ch class for accessing pr class from it 
// main uses are calling pr class,inatance variables,methods,constructors
class animals
{
	int n=12;
	animals()
	{
		System.out.println("bye");
	}
 void dis()
 {
	 System.out.println("hii");
 }
}
class cet extends animals
{ int n=23;
	cet()
	{
		super();
		System.out.println("bye bye");
	}
	void dis()
	{
		super.dis();
		System.out.println(super.n);
		System.out.println(n);
	}
}

public class superclass {
public static void main(String[] args)
{
	cet k=new cet();
	k.dis();
	
}
}
