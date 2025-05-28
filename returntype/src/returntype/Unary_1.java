package returntype;

public class Unary_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		int b=1;
		int c=0;
		c=b++ + ++b+ b++;
		System.out.println(b);
		System.out.println(c);
	}

}
