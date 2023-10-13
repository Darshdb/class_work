//Q1-Write a program to find greatest among 3 numbers using nested if.


import java.util.Scanner;										//import the scanner class from util packege

class GreatestNestedIf										//define the class
{
	public static void main(String[]args)							//main method started
	{
		int num1,num2,num3;								//variable declaration
	
		Scanner sc=new Scanner(System.in);					//Scanner class object is created
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		System.out.println("Enter the third number:");
		num3=sc.nextInt();
				
		
		if(num1 >= num2) 									//check the condition first number is greater than equal to second
		{
                if(num1 >= num3)									//check the condition first number is greater than equal to third
		
              		  System.out.println(num1 + " is the largest number.");	//if both conditions are true then print first is largest
                else												//this is inner else
                	  System.out.println(num3 + " is the largest number.");	//if condition is false then print third is largest
       		 } 
		else 												//this is outer ele
		{
          	  if(num2 >= num3)									//check the condition second number is greater than 3
             		   System.out.println(num2 + " is the largest number.");	//if condition is true then print second is largest
           	 else												//inner else
               		   System.out.println(num3 + " is the largest number.");	//if condition is false then print third is largest
        	}

		
}
}