package programs;
import java.util.Scanner;
public class vowel_conso {
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter the character");
		char a=t.next().charAt(0);
		if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
		{
			System.out.println(a+" is vowel");
		}
		else
		{
			System.out.println(a+" is consonant");
		}
	}
}
