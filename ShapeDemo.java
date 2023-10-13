/*Question 3: Create a superclass called "Shape" with properties like "numSides" and "color". Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. Write a Java program to display the details of a triangle, a square, and a circle.*/

import java.util.Scanner;
class Shape {
	
	public String color;
		Scanner sc=new Scanner(System.in);
		
		public Shape(){
		System.out.println("Enter the color:");
		color=sc.nextLine();
	}

}

class Triangle extends Shape {
	double sideLengths;
	public int numSide;
	public Triangle()
	{
	System.out.println("Enter the triangle side lengths:");
	sideLengths=sc.nextDouble();
	System.out.println("Number of sides:"+numSide);
	System.out.println("Triangle side lengths:"+sideLengths);
	System.out.println("Color of triangle:"+color);
	}	
   
}

class Square extends Shape {
	double sideLengths;
	public int numSide;
	public Square()
	{
	System.out.println("Enter the square side lengths:");
	sideLengths=sc.nextDouble();
	System.out.println("Number of sides:"+numSide);
	System.out.println("Square side lengths:"+sideLengths);
	System.out.println("Color of square:"+color);
	}
   
}

class Circle extends Shape {
	double radius;
	public Circle()
	{
    	System.out.println("Enter the radius:");
	radius=sc.nextDouble();
	System.out.println("Size of circle radius:"+radius);
	System.out.println("Color of circle:"+color);
	}
}

public class ShapeDemo {
    public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		int numSides;

	
	System.out.println("Enter the number of sides:");
	numSides=st.nextInt();


		if(numSides==3)
		{
			Triangle tr=new Triangle();
		}
		else if(numSides==4)
		{
			Square sq=new Square();
		}
		else if(numSides==0)
		{
			Circle cr=new Circle();
		}

		else
			System.out.println("Invalid input");
        
    }
}
