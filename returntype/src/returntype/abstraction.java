package returntype;//abstraction is nothing but hiding the internal complexity implementation and providing necessary information to the user
abstract class parts{
	String n;
	parts(String n)
	{
		System.out.println(n);
	}
	abstract void function();
	void f(String n)
	{
		System.out.println(n);
	}
}
class brakes extends parts
{ brakes(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("brakes applied");
	}
	 
}
class accelerator extends parts{
	accelerator(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("accelerator applied");
	}
}

public class abstraction {

	public static void main(String[] args) {
		 brakes k=new brakes("kushal"); k.function();k.f("unlucky");
		 accelerator j=new accelerator("kumar");j.function();j.f("lucky");
	}

}
