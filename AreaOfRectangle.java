//Q1-Write a program to get area of rectangle?

import java.util.Scanner;

class AreaOfRectangle
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the length:");
	double lgt=sc.nextDouble();
	System.out.println("Enter the breadth:");
	double bdt=sc.nextDouble();

	double area=lgt*bdt;
	System.out.println("Area of rectangle is:"+area);
}
}