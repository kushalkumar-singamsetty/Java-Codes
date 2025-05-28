package returntype;

public class multidimensional_arr {

	public static void main(String[] args) {
		 int a[][]= {{1,2,3},{7,8,9},{8,9,3}};
		 for (int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 System.out.print(a[i][j]);
			 }
		 }
		  
	
	System.out.println(a[1][2]);  
	}
}
