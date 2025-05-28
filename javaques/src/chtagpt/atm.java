package chtagpt;
import java.util.Scanner;
public class atm {
	String username1="KushalKumar";
	String username2;
	String password1="Rupesh";
	String password2;
	String insert1="yes";
	String insert2;
	 long balance=0;
	 int pin1=1225;
	 int pin2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		atm obj1=new atm();
		System.out.println("Please insert your atm card");
		obj1.insert2=sc.next();
		if((obj1.insert1).equals(obj1.insert2)) 
		{
			System.out.println("enter your username");
			obj1.username2=sc.next();
			System.out.println("enter the password");
			obj1.password2=sc.next();
			if((!(obj1.username1).equals(obj1.username2))&&(!(obj1.password1).equals(obj1.password2)))
			{
				System.out.println("INVALID USERNAME AND PASSWORD ");
			}

			else if((obj1.username1).equals(obj1.username2))
			{
				if((obj1.password1).equals(obj1.password2))
				{
					System.out.println("-*-*-*-*--*-*");
					System.out.println("press	1 ----->	DEPOSIT");
					System.out.println("press	2 ----->	AMOUNT TRANSFER");
					System.out.println("press	3 ----->	WITHDRAWAL");
					System.out.println("press	4 ----->	PINCHANGE");
					System.out.println("press	5 ----->	BALANCE ENQIRY");
					System.out.println("-*-*-*-*-*-*-*");
					System.out.println("your account balance is :");
					obj1.balance=sc.nextInt();
					for(int i=0;i<=5;i++)
					{
					int press=sc.nextInt();
					switch(press)
					{
						case 1: System.out.println("enter the amount : ");
								long deposit=sc.nextLong();
								obj1.balance=obj1.balance + deposit;
								System.out.println("**----Amount deposited Successfully----** ");
								System.out.println("your account balance is :" +obj1.balance);
								System.out.println("please remove your card");
								break;
						case 2: System.out.println("enter the amount : ");
								long transfer=sc.nextLong();
								if(transfer<=obj1.balance)
								{
									System.out.println("enter the pin no.");
									obj1.pin2=sc.nextInt();
									if(obj1.pin1==obj1.pin2) {
									System.out.println("**----Amount transferred Successfully----** ");
									obj1.balance=obj1.balance-transfer;
									System.out.println("Your balance is : "+( obj1.balance));
									System.out.println("please remove your card");
								}
									else
										System.out.println("INCORRECT PIN");
								}
								else
								{
									System.out.println("**----INSUFFICIENT BALANCE----**");
									System.out.println("please remove your card");
								}
								break;
						case 3: System.out.println("enter the amount");
								long withdraw=sc.nextLong();
								if(withdraw<=obj1.balance)
									{
									System.out.println("enter the pin no.");
									obj1.pin2=sc.nextInt();
									if(obj1.pin1==obj1.pin2) {
										obj1.balance=obj1.balance-withdraw;
										if(withdraw>=2000)
										{
											long a=withdraw/2000;
											System.out.println("2000  X  "+a);
											withdraw=withdraw%2000;
										}
										if(withdraw>=500)
										{
											long a=withdraw/500;
											System.out.println("500  X  "+a);
											withdraw=withdraw%500;
										}
										if(withdraw>=100)
										{
											long a=withdraw/100;
											System.out.println("100  X  "+a);
											withdraw=withdraw%100;
										}
										if(withdraw>=50)
										{
											long a=withdraw/50;
											System.out.println("50  X  "+a);
											withdraw=withdraw%50;
										}
										System.out.println("**----Amount withdrawed Successfully----** ");
										System.out.println("Your balance is : "+(obj1.balance));
										System.out.println("please remove your card");
									}
									else
										System.out.println("INCORRECT PIN");
									}
									else
									{
										System.out.println("**----INSUFFICIENT BALANCE----**");
										System.out.println("please remove your card");
									}
									
								 break;
						case 4: System.out.println("enter the pin no.");
								obj1.pin2=sc.nextInt();
								System.out.println("enter the pin no. to change");
								 int changepin =sc.nextInt();
								 if(obj1.pin1==obj1.pin2) {
									 System.out.println("PIN NO SHOULD NOT BE SAME AS PREVIOUS");
								 }
								 else
								 {
									 obj1.pin1=changepin;
									 System.out.println("**----pin changed Successfully----** ");
									 System.out.println("please remove your card");
								 }
									 break;
						case 5: System.out.println("your account balance : "+ obj1.balance);
								System.out.println("please remove your card");
								break;
								
						default: System.out.println("THANK YOU");
						
					}
				}
				}
				else
					System.out.println("INCORRECT PASSWORD");
			}
			else
				System.out.println("INVALID USERNAME");
		}
		else
			System.out.println("INVALID CARD");
			
		
	}

}
