package programs;
import java.util.Scanner;
public class weekday {
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);
		System.out.println("enter the day no.");
		int a=k.nextInt();
		switch(a)
		{
		case 2: System.out.println("monday "); break;
		case 3: System.out.println("tuesday "); break;
		case 4: System.out.println("wednesday "); break;
		case 5: System.out.println(" thursday"); break;
		case 6: System.out.println(" friday"); break;
		case 7: System.out.println("saturday "); break;
		case 1: System.out.println(" sunday"); break;
		default: System.out.println(" not a week no");
		}
	}
}
