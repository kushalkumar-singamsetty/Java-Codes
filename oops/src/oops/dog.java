package oops;

public class dog {
	static String barking ="howww";
	String colour="";
	public static void main(String[] args)
	{
		dog chow_chow=new dog();
		dog street=new dog();
		System.out.println(chow_chow.barking);
		System.out.println(street.barking);
		chow_chow.colour="black";
		street.colour="dusky";
		System.out.println(chow_chow.colour);
		System.out.println(street.colour);
		kk();
	}
	public static void kk()
	{
		dog meow=new dog();
		dog tiger=new dog();
		System.out.println(meow.barking);
		System.out.println(tiger.barking);
		meow.colour="white";
		tiger.colour="orange";
		System.out.println(meow.colour);
		System.out.println(tiger.colour);
	}
}
