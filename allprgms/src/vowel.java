import java.util.Scanner;

public class vowel { 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  character");
		char k=s.next().charAt(0);
		char d=s.next().charAt(0);
		int b=0;
		int c=0;
		while(k<=d) {
		if(k>=65&&k<=90||k>=97&&k<=122)
			if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U') {
			 
			b++;
		}
			else {
				 
				c++;
			}
		else {
			System.out.println("char is not alphabetq");
		}
		k++;}
		System.out.println("no.of vowels" + b);
		System.out.println("no.of consonants" + c);
	}

}
