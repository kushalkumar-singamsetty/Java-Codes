package returntype; //method hiding refers for static  method
//method overriding refers for instance method 
class Dog{
	static void test() {
		System.out.println("hiding 1");
	
	}
	void test1() {
		System.out.println("overriding 1");
	}
	class Cat extends Dog{
		static void test() {
			System.out.println("hiding 2");
		
		}
		void test1() {
			System.out.println("overriding 2");
		}
	}
}
public class methodhiding_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog a=new Cat();//here in compile time reference type is dog so it implements static method in dog class 
// and runtime object is cat() so it implements nonstatic method in cat class
a.test();
a.test1();
}

}
