//Q25-WAP to check whether the number is armstrong or not.

import java.util.Scanner;							//import scanner class from util package

class Armstrong								//class started
{
	public static void main(String[]args)				//main method started
	{
		int n,arm=0,rem,c;						//variable declaration
		Scanner sc=new Scanner(System.in);		//scanner method object created
		System.out.println("Enter the number");
		n=sc.nextInt();

		c=n;									
		while(n>0)								//while condition checking
		{
			rem=n%10;						//user input mod by 10
			arm=(rem*rem*rem)+arm;				//get the cube of reminder
			n=n/10;							//user input devide by 10
		}
			
		if(c==arm)								//check n means user input is equal to arm then print the output
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
}
}
		