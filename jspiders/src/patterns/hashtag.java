package patterns;

public class hashtag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;  int m=(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=m&&j<=i||(i>m&&i+j<=n+1))
					System.out.print("L ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}

}
