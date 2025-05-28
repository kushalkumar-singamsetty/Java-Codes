package returntype;
class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e='a';	//b<s<c<i<l<f<d
		double d=.25;
		System.out.println(d);
		q();

	}
	static double d=45.251;
	double e='q';
	static int a;
	public static void q()
	{
		typecasting obj=new typecasting();
		System.out.println(obj.e);
		System.out.println(typecasting.d);
		obj.e='q';
		System.out.println(obj.e);
		System.out.println(typecasting.a);
		typecasting.a=(int)5.24;
		System.out.println(typecasting.a);
	}
}
		
