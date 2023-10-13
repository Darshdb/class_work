
//Q6-WAP to grade the students result?

import java.util.Scanner;									//import scanner class from the util package

class StudGrade										//class define
{
	public static void main(String[]args)						//main method started
	{
		int stud;						//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter your percentage:");
		stud=sc.nextInt();
		
		if(stud>=75)						//check the condition and print the exact output
		{
			System.out.println("This is the distinction");
		}
		else if(stud<75 && stud>=60)
		{
			System.out.println("This is the first class");
		}
		else if(stud<60 && stud>=45)
		{
			System.out.println("This is the second class");
		}
		else if(stud>45 && stud>=35)
		{
			System.out.println("This is pass");
		}
		else
		{
			System.out.println("This is fail");
		}
}
}