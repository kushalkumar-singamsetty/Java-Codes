package patterns;

public class ompattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10; int m=(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1&&j<=m)||(j==m)||(i==n&&j>=m)||(j==1&&i>=m)||(i==m)||(j==n&&i<=m))
					System.out.print("L ");	
				else
					System.out.print("p ");
			}
			System.out.println();
		}
	}

}
