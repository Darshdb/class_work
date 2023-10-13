/*Q27-Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output. */

import java.util.Scanner;								//import scanner class from util package

class Factorial										//class started
{
	public static void main(String[]args)					//main method started
	{
		float i=1,fact=1,num;							//variable declaration
		Scanner sc=new Scanner(System.in);			//scanner method object created
		System.out.println("Enter the number");
		num=sc.nextFloat();
									
		while(i<=num)								//while condition checking
		{
									
			fact=fact*i;							//fact is multiply by i
			i++;									//value of i is increase by one
		}
			
			System.out.println("The factorial is:"+fact);		//print the output
}
}
		