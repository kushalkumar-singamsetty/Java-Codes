package oops;

public class callbyval {
	int a;
	int b;
	static void kk(int a,int b)
	{
		 a=89;
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		callbyval kk1=new callbyval();
		kk1.a=12;
		kk1.b=13;
		System.out.println(kk1.a+kk1.b);
		kk(kk1.a,kk1.b);
		System.out.println(kk1.a+kk1.b);
	}

}
