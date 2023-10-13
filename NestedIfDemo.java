
//Q15-Write a program to accept a number and check wheather it is less than 100 or greater than 50 other wise greater than 100.

import java.util.Scanner;										//import the scanner class from util packege

class NestedIfDemo											//define the class
{
	public static void main(String[]args)							//main method started
	{
		int num;											//variable declaration
	
		Scanner sc=new Scanner(System.in);					//get the inputes from the user
		System.out.println("Enter the number:");
		num=sc.nextInt();
				
		
		if(num<100)						//check the condition and print the exact output
		{
			System.out.println("Number is less than 100:");
		if(num>50)
		{
			System.out.println("Number is greater than 50:");
		}
}
		else
		{	
			System.out.println("Number is greater than 100:");
		}
		
}
}