/*Q16-Wap to accept age and weight and make a decision whether he can donate a blood or not
	If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not. */


import java.util.Scanner;										//import the scanner class from util packege

class DonateBlood											//define the class
{
	public static void main(String[]args)							//main method started
	{
		int age,weight;										//variable declaration
	
		Scanner sc=new Scanner(System.in);					//get the inputes from the user
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the weight:");
		weight=sc.nextInt();
				
		
		if(age>18)											//check the condition and print the exact output
		{
			System.out.println("It is eligible to donate the blood");
		if(weight>50)
		{
			System.out.println("It is eligible to donate the blood");
		}
}
		else
		{	
			System.out.println("It is not eligible to donate the blood");
		}
		
}
}