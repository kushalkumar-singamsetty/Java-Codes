package patterns;

public class top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=5-i+1)
					System.out.print("L ");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
