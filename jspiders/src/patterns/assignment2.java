package patterns;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1; int p=10;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2!=0)
				{
					System.out.print(l+"	");
					l++;
				}
				else {
					System.out.print(p+"	");
					p--;
				}
			}
			if(i%2!=0) l=l+5;
			if(i%2==0) p=p+15;
			System.out.println();
		}
	
	}
}
