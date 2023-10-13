/*Q42-create a class Shape with fields length,breadth,radius and other two classes rectangle and Circle extending from that Shape class.Apply other methods to calculate area of rectangle and circle*/

import java.util.Scanner;
class Shape
{
	double length,breadth,radius;
	Scanner sc=new Scanner(System.in);
}
class Rectangle extends Shape
{
	public Rectangle()
	{
		System.out.println("Enter the lenght:");
		length=sc.nextDouble();
		System.out.println("Enter the breadth:");
		breadth=sc.nextDouble();
		System.out.println("The area of rectangle is:"+(length*breadth));
	}
}
class Circle extends Shape
{
	public Circle()
	{
		System.out.println("Enter the radius:");
		radius=sc.nextDouble();
		System.out.println("The area of circle is:"+(3.14*radius*radius));
	}
}
class Calculate
{
	public static void main(String[]args)
	{
		int type;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for calculate area rectangle, Press 2 for calculate area circle:");
		
		type=sc.nextInt();
	
		if(type==1)
		{
		Rectangle rt=new Rectangle();
		}
		if(type==2)
		{
		Circle cr=new Circle();
		}
	}
}
