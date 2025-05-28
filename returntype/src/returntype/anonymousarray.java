package returntype;

public class anonymousarray{
	static void main(int a[]) {
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		main(new int[]{1,2,3,4});//here we are not declaring the array but declared 
		//elements and used for method call
		int a[]= {1,2,3,4,5};
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		

	}

}
