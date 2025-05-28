package chtagpt;
import java.util.Scanner;
public class grades {
	int marks;
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		grades obj1=new grades();
		System.out.println("enter the marks marks: ");
		obj1.marks=S.nextInt();
		char grade='A';
		switch(obj1.marks/10)
		{
		case 10,9 :  grade= 'A';
		break;
		case 8    : grade='B';
		break;
		case 7,6 : grade='C';
		break;
		case 3,2,1:grade='F';
		break;
		}
		System.out.println(grade);
		m();
	}
	public static void m() {
		Scanner a=new Scanner(System.in);
		grades obj2=new grades();
		for(int i=0;i<=4;i++) {
			System.out.println("enter the marks marks: ");
			obj2.marks=a.nextInt();
			if(obj2.marks>=90&&obj2.marks<=98)
			{
				System.out.println("A+");
			}
			else if(obj2.marks>=79&&obj2.marks<=89)
			{
				System.out.println("A");
			}
			else if(obj2.marks>=68&&obj2.marks<=78)
				{
					System.out.println("B+");
				}
			else if(obj2.marks>=50&&obj2.marks<=67)
				{
					System.out.println("C");
				}
			else if(obj2.marks>=30&&obj2.marks<=49)
				{
					System.out.println("D");
				}
			else if(obj2.marks<=28)
				{
					System.out.println("fail");
				}
			
		}
	}
	


}
