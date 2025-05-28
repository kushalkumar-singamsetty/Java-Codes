package chtagpt;
import java.util.Scanner;
public class lowtoup {
	char a;
	char b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		lowtoup obj=new lowtoup();
		System.out.print("enter the 1st alphabet : ");
		obj.a=s.next().charAt(0);
		System.out.print("enter the 2nd alphabet : ");
		obj.b=s.next().charAt(0);
			if(obj.a>=65&&obj.a<=90||obj.a>=97&&obj.a<=122)
			{
				for(;obj.a<=obj.b;obj.a++) 
				{
					if(obj.a>=65&&obj.a<=90)
					{
						char c=(char)(obj.a+32);
						System.out.print(c+"  ");
					}
					else 
					{
						char d=(char)(obj.a-32);
						System.out.print(d+"  ");
					}
				}
			}
			System.out.println();
			 if(obj.a>=48&&obj.a<=57)
				{
					System.out.println("a it's a digit");
				}
			 else if(obj.a>=65&&obj.a<=90||obj.a>=97&&obj.a<=122)
			 {
				 System.out.println("a is alphabet");
			 }
					else
					{
						System.out.println("a special character");
					}
			if(obj.b>=48&&obj.b<=57)
					{
						System.out.println("b it's a digit");
					}
					else if (obj.b>=65&&obj.b<=90||obj.b>=97&&obj.b<=122)
					{
						System.out.println("b is alphabet");
					}
					else
					{
						System.out.println("b is special character");
					}
		}
	}


