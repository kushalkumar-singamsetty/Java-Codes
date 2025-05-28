package programs;
import java.util.Scanner;
public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int price=obj.nextInt();
		int quantity=obj.nextInt();
		int revenue=price*quantity;
		System.out.println(revenue);
		if(revenue>5000)
		{
			int discount=(revenue*10)/100;
			System.out.println("discount = "+ discount);
			System.out.println("revenue after discount = " + (revenue-discount));
		}
		else 
		{
			System.out.println(" no discount");
			System.out.println(revenue);
		}
	}

}
