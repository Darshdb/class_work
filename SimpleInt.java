//Q2-Write a program to calculate simple interest?

import java.io.*;
import java.util.Scanner;									//import the pre defined packages and class

class SimpleInt											//define the class
{
	public static void main(String[]args)						//main method started
	{
		Scanner sc=new Scanner(System.in);				//object of the scanner method is created

		//get the values from user

		System.out.println("Enter the principal:");
		double p=sc.nextDouble();				
		System.out.println("Enter the rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter the time:");
		double t=sc.nextDouble();


		Double si = (p* t * r) / 100;							//Calculate simple interest 

		System.out.println("Simple interest = " + si); 			//display the output
	}
}

