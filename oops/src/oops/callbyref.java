package oops;

public class callbyref {
	int a;
	int b;
	static void kk(callbyref kk2,callbyref kk1 )
	{
		 kk2.a=23;
		System.out.println(kk2.a+kk2.b);
	}

	public static void main(String[] args) {
		callbyref kk2=new callbyref();
		
		kk2.a=12;kk2.b=32;
		System.out.println(kk2.a+kk2.b);
		kk(kk2,kk2);
		System.out.println(kk2.a+kk2.b);
		
		
	}

}
