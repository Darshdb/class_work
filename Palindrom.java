//Q26-WAP to check whether the number is palindrome or not.

import java.util.Scanner;							//import scanner class from util package

class Palindrom								//class started
{
	public static void main(String[]args)				//main method started
	{
		int n,rev=0,rem,c;						//variable declaration
		Scanner sc=new Scanner(System.in);		//scanner method object created
		System.out.println("Enter the number");
		n=sc.nextInt();

		c=n;									
		while(n>0)								//while condition checking
		{
			rem=n%10;						//user input mod by 10
			rev=(rev*10)+rem;					//rev multiply by 10 + reminder
			n=n/10;							//user input devide by 10
		}
			
		if(c==rev)								//check n means user input is equal to arm then print the output
		{
			System.out.println("The number is palindrom");
		}
		else
		{
			System.out.println("The number is not palindrom");
		}
}
}
		