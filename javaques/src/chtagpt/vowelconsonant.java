package chtagpt;
import java.util.Scanner;
public class vowelconsonant {
	char c;
	char d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet");
		vowelconsonant obj=new vowelconsonant();
		int i=0;
		while(i<4)
		{
			obj. c=sc.next().charAt(0);
			if(obj.c>=65&&obj.c<=90||obj.c>=97&&obj.c<=122) 
				if(obj.c=='a'||obj.c=='A'||obj.c=='e'||obj.c=='E'||obj.c=='i'||obj.c=='I'||obj.c=='o'||obj.c=='O'||obj.c=='u'||obj.c=='U')
				{
					System.out.println(obj.c+" is a vowel");
				}
				else
				{
					System.out.println(obj.c+" is a constant");
				}
			else if(obj.c>=48&&obj.c<=57)
			{
				System.out.println("it's a digit ");
			}
				else {
					System.out.println("Special character");
				}
				i++;
		}
	}

}
