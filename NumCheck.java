//Q10-WAP to print whether the number is positive,negative or zero.

import java.util.Scanner;									//import the scanner class from util packege

class NumCheck											//define the class
{
	public static void main(String[]args)						//main method started
	{
		int num;										//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter the salary:");
		num=sc.nextInt();
		
		if(num>=1)								//check the condition and print the exact output
		{
			System.out.println("Number is positive");
		}
		else if(num==0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Number is negative");
		}
}
}