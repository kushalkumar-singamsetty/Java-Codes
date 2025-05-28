package oops;

public class static_instance {
	int a=23;//non static variable
	static int b=54;//static variable
	public static void main(String[] args) {
		System.out.println(static_instance.b);
		static_instance kk=new static_instance();
		static_instance kk2=new static_instance();
		System.out.println(kk.a);//23
		System.out.println(kk.b);//54
		kk.a=34;kk.b=45;
		System.out.println(kk2.a);//34
		System.out.println(kk2.b);//45
		System.out.println(kk.a);//34
		System.out.println(kk.b);//45 for static only one memory location so data can rewrite  but for non static
		//diff memory loc fordiff obj so we get diff values
		
	}
}
