//Q5-write a program to check whether the number is even or odd?

import java.util.Scanner;

class EvenOdd
{
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();

		if(num%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number odd");
		}
}
}
		