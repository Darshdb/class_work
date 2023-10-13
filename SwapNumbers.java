//Q5-Write a program to swap two numbers a=10 b=20?

import java.util.Scanner;					//import the java package for scanner
public class SwapNumbers {				//define the class

    public static void main(String[] args) {		//main method started

        int first, second,temp;				//variable declaration
	
	Scanner sc=new Scanner(System.in);		//scanner method object created

	System.out.println("Enter the first number:");
	first=sc.nextInt();
        System.out.println("Enter the second number:");
	second=sc.nextInt();
	System.out.println("Before changing:");
        System.out.println("First number :" + first);
        System.out.println("Second number :" + second);

       											 // Value of first is assigned to temporary
        temp = first;

       											 // Value of second is assigned to first
        first = second;

        										// Value of temporary is assigned to second
        second = temp;

        System.out.println("After changing:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}