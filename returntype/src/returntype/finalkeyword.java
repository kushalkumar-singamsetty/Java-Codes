package returntype;
class kk{
	void disp() {
		System.out.println("hii");
	}
}
class kk1 extends kk{
	void disp() {
		System.out.println("hello");
	}
}
 public class finalkeyword {
	 
	public static void main(String[] args) {
		kk a=new kk1();
		a.disp();
		 	
		

	}

}
