package patterns;

public class left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
					System.out.print("L ") ;
				else 
					System.out.print("  ");
					
			}
			System.out.println();
		}
	}

}
