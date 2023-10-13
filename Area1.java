//Q33-WAP to calculate area of rectangle,square and circle using class and object concept.

import java.util.Scanner;

class Area
{
		double l,b,r;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		l=sc.nextDouble();
		System.out.println("Enter the breadth");
		b=sc.nextDouble();
		System.out.println("Enter the radius");
		r=sc.nextDouble();
	}

	public void rectangle()
	{	
		System.out.println("Area of rectangle is"+(l*b));
	}
	public void circle()
	{
		
		System.out.println("Area of circle is"+(22*r*r));
	}
	public void square()
	{
		
		System.out.println("Area of square is"+(l*l));
	}
}
	public class Area1
	{
		public static void main(String args[])
		{
			Area ob=new Area();
			ob.input();
			ob.rectangle();
			ob.circle();
			ob.square();
	}
}