//Q23-WAP a program to accept numbers from user and find sum of digits.

import java.util.Scanner;  
class SumOfDigit 
{  
	public static void main(String arg[])  
	{  
		int number, sum;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
												//reads a long number from the user  
		number=sc.nextInt();  
												//executes until the condition number!=0 becomes false  
		for(sum=0; number!=0; number=number/10)  
		{  
												//finds the last digit and add it to the variable sum      
			sum = sum + number % 10;  
		}  
												//prints the result  
			System.out.println("Sum of digits: "+sum);  
}  
}  
