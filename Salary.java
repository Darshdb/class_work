import java.util.Scanner;									//import the scanner class from util packege

class Salary											//define the class
{
	public static void main(String[]args)						//main method started
	{
		int salary;										//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
		
		if(salary>=50000 && salary<75000)								//check the condition and print the exact output
		{
			System.out.println("I am happpy");
		}
		else if(salary>=75000 && salary<100000)
		{
			System.out.println("I have better life");
		}
		else if(salary>=100000)
		{
			System.out.println("My family is happy with me");
		}
		else
		{
			System.out.println("I am not comfortable with this salary");
		}
}
}