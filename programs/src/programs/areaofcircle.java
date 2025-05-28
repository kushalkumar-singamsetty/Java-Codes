package programs;
import java.util.Scanner;
public class areaofcircle {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("1. area of circle   2. are of rectangle  3. area of triangle  4. area of square  5. area of rhombus ");
		int a=obj.nextInt();
		switch(a)
		{
		case 1: System.out.print("enter the radius of circle");//pie R square
				int r=obj.nextInt();
				System.out.println( "area of circle is  " + 3.14*(a*a));
				break;
		case 2: System.out.println("enter the length and width ");//l*w
				int length=obj.nextInt();
				int width=obj.nextInt();
				System.out.println(length*width);
				break;
		case 3: System.out.println("enter the height and breadth");
				int height=obj.nextInt();
				int breadth=obj.nextInt();
				System.out.println(0.5*height*breadth);
				break;
		case 4: System.out.println("enter the side");//a square
				int side=obj.nextInt();
				System.out.println(side*side);
				break;
		case 5: System.out.println("enter the two diagnoals");// 1/2*d1*d2
				int d1=obj.nextInt();
				int d2=obj.nextInt();
				System.out.println(0.5*d1*d2);
				break;
		default: System.out.println("INVALID");
				
		}
	}
}
