package returntype;

public class methodcalling {
	public static void mi(int a,int b)
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(a*b);
		}
	}
	public static void main(String[] args)
	{
		mi(2,25);
		kk(5,55);
	}
	public static void kk(int l,int m)
	{
		int i=0;
		while(i<l)
		{
			System.out.println(l/m);
			i++;
		}
		
	}

	 }
