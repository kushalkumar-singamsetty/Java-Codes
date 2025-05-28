package returntype;

public class cast {
			static char a=(char)113.8;
			char b=(int)45.2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cast.a);
		cast obj=new cast();
		System.out.println(obj.b);
		int c=65535;
		float d=8.25251225581f;
		int g=(int)d;
		System.out.println(c);
		System.out.println(g);
		if(c==d)
		{
			System.out.println("equal");
		}
		int a=10;
		a+=10;
		System.out.println(a);
		a-=10;
		System.out.println(a);
		a*=3;
		System.out.println(a);
		a/=3;
		System.out.println(a);
		a%=2;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		System.out.println(a=a+1);
		System.out.println(a+"1");
		System.out.println("a value is"+a+2+2);
		int res=a+c;
		System.out.println(res);
		System.out.println("a+c"+res);
		System.out.println("a"+"+"+"c"+"="+res);
		int count =1;
		count+=1;
		System.out.println(count);
	}

}
