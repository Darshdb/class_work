/* Note:When we are using conditional statements we make use of comparison operators
	>,<,>=,<=,==,!= ... etc. */

import java.util.Scanner;
class IfDemo
{
	public static void main(String[]args)
	{
		int voter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		voter=sc.nextInt();

		if(voter>=18)	//this returns boolean expression True or False
		{
			System.out.println("voter is eligible");
		}
		else
		{	
			System.out.println("voter is not eligible");
		}
}
}