package oops;

public class constructor {
	int a;
	int b;
	private constructor()//default constructor
	{
		
	}
	public constructor(int c,int d)//parameterised constructor
	{
		a=c;
		b=d;
		 
	}

	public static void main(String[] args) {
		constructor kk=new constructor();
		constructor kk1=new constructor(1,2);
		System.out.println(kk.a+kk.b);
		System.out.println(kk1.a+kk1.b);

	}

}
