package oops;

public class methodoverloading {
	static void kk(int a,int b)
	{
		System.out.println(a+b);
	}
	static void kk(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	static void kk(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		kk(1,2,3);
		kk(1,2);
		kk(1,2,3.5);
	}
}
