//Q40-WAP to calculate area of rectangle, area of Square and area of circle using method overloading

import java.util.Scanner;

class AreaOf
{
	Scanner sc=new Scanner(System.in);
	public void area(int length,int breadth)
	{

	System.out.println("Area of rectangle is:"+length*breadth);
	}
	public void area(double side)
	{

	System.out.println("Area of square is:"+side*side);
	}
	public void area(int radius)
	{
	System.out.println("Area of circle is:"+3.14*radius*radius);
	}
public static void main(String[]args)
{
	AreaOf ar=new AreaOf();
	ar.area(10,20);
	ar.area(3.1);
	ar.area(10);
}
}
	