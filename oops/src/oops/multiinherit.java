package oops;
 

class animals{
	 void kk()
	{
		System.out.println("parent class");//base class
	}
}
class meow extends animals{
	void kk1()
	{
		System.out.println("child/parent class");//derived class
	}
}
class cat extends meow{
	void kk2()
	{
		System.out.println("child class");//derived class
	}
}

public class multiinherit {
	public static void main(String[] args) {
	
	cat k=new cat();
k.kk1();
k.kk();
k.kk2();
	}
}
