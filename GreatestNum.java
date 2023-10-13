//Q9- WAP to accept three numbers from users and make a desicion which is the greatest number among three.

import java.util.Scanner;									//import the scanner class from util packege

class GreatestNum											//define the class
{
	public static void main(String[]args)						//main method started
	{
		int num1,num2,num3;										//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter the num1:");
		num1=sc.nextInt();
		System.out.println("Enter the num2:");
		num2=sc.nextInt();
		System.out.println("Enter the num3:");
		num3=sc.nextInt();
		
		
		if(num1>num2 && num1>num3)								//check the condition and print the exact output
		{
			System.out.println("Num1 is greater than num2");
		}
		else if(num2>num3)
		{
			System.out.println("Num2 is greater than num3");
		}
		else 
		{
			System.out.println("Num3 is greater");
		}
}
}