package com.leetcode;

public class ControlFlowstructure {
	public static void main(String[] args) {
		outerloop:
		for(int i=0;i<10;i++)
		{
			innerloop: //label
			for(int j=1;j<=2;j++)
			{
				if(j!=0)
				{
					continue outerloop;
				}
				System.out.println("Inner loop");
			}
			System.out.println("Outer Loop");
		}
		System.out.println("main method");
	}
}
/*Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
Inner loop
Outer Loop
main method
*/