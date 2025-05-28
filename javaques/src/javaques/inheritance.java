package javaques;		//single inheritance
class animals{
	 void kk()
	{
		System.out.println("parent class");//base class
	}
}
class dog extends animals{
	void kk1()
	{
		System.out.println("childclass");//derived class
	}
}
 


public class inheritance {

	public static void main(String[] args) {
//when we want to call the method in above class we have to 
//create an object for child so we can call both ch&par
		dog k=new dog();
		k.kk1();
		k.kk();
		
	}

}
