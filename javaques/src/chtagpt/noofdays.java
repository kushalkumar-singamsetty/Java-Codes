package chtagpt;
import java.util.Scanner;
public class noofdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		System.out.println("enter the month and year");
		int month=o.nextInt();
		int year=o.nextInt();
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12: System.out.println("31 days"); break;
		case 4:
		case 6:
		case 9:
		case 11	: System.out.println("30 days"); break;
		case 2	:if(year%4==0&&year%100!=0) System.out.println("29 days and leap year");
					else if(year%400==0) System.out.println("29 days and leap year");
					else System.out.println("28 days");
					break;
		default : System.out.println("INVALID");
		}
	}

}
