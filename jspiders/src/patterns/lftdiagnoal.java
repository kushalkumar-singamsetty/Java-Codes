package patterns;
public class lftdiagnoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==(n+1)/2||j==(n+1)/2)
				{
					System.out.print("L ");
				}
				else System.out.print("O ");
			}
			System.out.println();
		}
	}

}
