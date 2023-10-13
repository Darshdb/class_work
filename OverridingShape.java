//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
import java.util.Scanner;
class Shape
{
	double length;
	double breadth;
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length:");
		length=sc.nextDouble();
		System.out.println("Enter the breadth:");
		breadth=sc.nextDouble();
	
	}
}
class Rectangle extends Shape
{
	public void getArea()
	{	
		super.getArea();
		
		System.out.println("Area of rectangle is:"+length*breadth);
	}
}
class OverridingShape
{
	public static void main(String[]args)
	{
		Rectangle rk=new Rectangle();
		rk.getArea();
	}
}