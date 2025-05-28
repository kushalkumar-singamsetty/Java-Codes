package patterns;
import java.util.Scanner;
public class snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			if(i%2!=0)
			{
				int  a=(i-1)*n+1;
				for(int j=1;j<=n;j++)
				{
					System.out.print(a+"	");
					a++;
				}
			}
			else
			{
				int b=i*n;
				for(int j=1;j<=n;j++)
				{
					System.out.print(b+"	");
					b--;
				}
			}
			System.out.println();
			
		}
		
	
	}

}
