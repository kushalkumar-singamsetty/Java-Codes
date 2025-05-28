package oops;//inheritance is acquiring features of one class to another
class test {//parent class
	 void kk()
	{
		System.out.println("parent class base class");
	}
}

class kat extends test
	{
		void kk1()
		{
		System.out.println("child class derived class");
	}
	}

public class inheritance{

	public static void main(String[] args) {
		//if we want to call the methods in above classes we have to create a
		//obj for child so we can call both parent and child methods
	kat k=new kat();
	k.kk1();
	k.kk();
	}
	
}


