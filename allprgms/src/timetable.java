import java.util.Scanner;

public class timetable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  day");
		String day=s.next();
		switch(day) {
		case "monday" : System.out.println("cricket"); break;
		case "tuesday" : System.out.println("volleyball");break;
		case "wednesday" : System.out.println("football");break;
		case "thursday" : System.out.println("swimming");break;
		case "friday" : System.out.println("running");break;
		case "saturday" : System.out.println("hockey");break;
		case "sunday" : System.out.println("basketball");break;
		 default : System.out.println("❤️dekaball");break;
		 
		}
		

	}

}
