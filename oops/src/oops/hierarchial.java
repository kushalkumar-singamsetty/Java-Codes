package oops;

class running{
	 void kk()
	{
		System.out.println("parent class");//base class
	}
}
class horse extends running{
	void kk2()
	{
		System.out.println("childclass");//derived class
	}
}
class rabbit extends running{
	void kk1()
	{
		System.out.println("meow");//derived class
	}
}


public class hierarchial {

	public static void main(String[] args) {
	rabbit k=new rabbit();
	horse n=new horse();
	k.kk1();
	n.kk2();
	k.kk();
	n.kk();

	}

}
