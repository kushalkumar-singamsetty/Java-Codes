package programs;
import java.util.Scanner;
public class avggrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q=new Scanner(System.in);
		System.out.println("enter the  3 subject marks");
		int total=0;
		int all=0;
		String means="";
		for(int i=1;i<4;i++)
		{
			int marks=q.nextInt();
			total+=marks;
			all++;
			
		}
		int avg=total/all;
		System.out.println(avg);
		if(avg>=90&&avg<=100) 	{ means="A"; System.out.println("A");}
		else if(avg>=80&&avg<=89) { means="B"; System.out.println("B");}
		else if(avg>=70&&avg<=79) {means="C"; System.out.println("C");}
		else if(avg>=60&&avg<=69) { means="D"; System.out.println("D");}
		else if(avg>=0&&avg<=59) {means="Fail"; System.out.println("Fail");}
		switch(means)
		{
			case "A": System.out.println("Excellent"); break;
			case "B": System.out.println("Good"); break;
			case "C": System.out.println("Average"); break;
			case "D": System.out.println("Below average"); break;
			case "Fail": System.out.println("Failed"); break;
			default: System.out.println("----***----"); 
		}
	}

}
