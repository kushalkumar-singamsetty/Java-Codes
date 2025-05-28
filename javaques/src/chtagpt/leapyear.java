package chtagpt;
import java.util.Scanner;
public class leapyear {
	int year;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		leapyear obj=new leapyear();
		obj.year=sc.nextInt();
		if((obj.year%400==0)) System.out.println("leap year");
		else if((obj.year%4==0)&&(obj.year%100!=0))
		{
			System.out.println(obj.year + "  is leap year");
		}
		else
		{
			System.out.println("non leap year");
		}
	}

}
