package returntype;
interface mgr{
	 int a=12;
	abstract void disp();
}
interface fr{
	void disp1();
}
class mango implements mgr,fr{
	mango(int n)
	{
		System.out.println(n);
	}
public	void disp()
	{
		System.out.println("king");
	}
public void disp1() {
	System.out.println("kushal");
}
}
public class Interface {

	public static void main(String[] args) {
		mango m=new mango(5);
		m.disp();
		m.disp1();
		
		System.out.println(m.a);

	}

}
