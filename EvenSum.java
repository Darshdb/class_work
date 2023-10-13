/*Write a program that prompts the user to enter a series of integers. The program should calculate the sum of all the even numbers entered, skipping any negative numbers. Use the continue statement to skip negative numbers.*/

import java.util.Scanner;

public class EvenSum
{
	public static void main(String[]args)
	{
		int num,sum=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers");
		for(int i=1;i<=10;i++)
		{
			num=sc.nextInt();
		if(num<0)
		{
			continue;
		}
		if(num%2==0)
		{
			sum=sum+num;	
		}
	}
	System.out.println("Sum of even numbers is"+sum);
}
}
		