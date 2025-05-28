package javaques;
class kushal{
	void kk()
	{
		 System.out.println("parent class");
	} 
}
class kumar extends kushal{
	void kk1()
	{
		System.out.println("child class for animlas & parent class for rabbit");//derived class
	}
}
class rabbit extends kushal{
	void kk3()
	{
		System.out.println("hii");
	}
		
	}

 
public class multiinher {
	public static void main(String[] args) {
		  rabbit k=new rabbit();
		  kumar k1=new kumar();
		  k.kk3();
		  k1.kk1();
		  k.kk();
	}

}
