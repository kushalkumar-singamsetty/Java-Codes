package programs;
import java.util.Scanner;
public class tenthexam {
	static String nine1="yes";
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("have you completed 9th class");
		System.out.println("if yes type yes");
		String nine2=obj.next();
		if(nine1.equals(nine2))
		{
			System.out.println("eligible to write 10th exams");
		}
		else System.out.println("cannot write exam ,complete 9th ");
	}
}
