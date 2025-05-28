package returntype;

public class string {

	public static void main(String[] args) {
		 String k="kushal";
		 String m=new String("kumar");
		 String n=new String("singamsetty");
		 System.out.println(k.charAt(4));//gives 4th index char
		 System.out.println(k.lastIndexOf('h'));//returns char index value
		 System.out.println( k.contains("ku"));//ret boolean value by checking given string in k
		 System.out.println( k.length());//gives length of string
		 System.out.println( k.endsWith("al"));//checks whethwe ends with given string
		 System.out.println( k.replace('l','k'));//replace all the char val by new ones
		 System.out.println( n.toLowerCase());//converts into lowercase
		 System.out.println( n.toUpperCase());//converts into uppercase
		 System.out.println( k.concat("kumar"));//comines given string with k string
		 System.out.println( k.substring(2));//from the 2nd index returns the string
		 System.out.println( k.equals(m));//checks k string is equal to m obj string including cases
		 System.out.println(k.equalsIgnoreCase(n));//ignores the casese and checks 
		 System.out.println( n.isEmpty());//checks given string is empty or not
		 System.out.println( n.trim());//trims the space in starting and ending
	}

}
