//Q1-Write a Package MCA which has one class Student. Accept student detail through parameterized constructor. Write display () method to display details. Create a main class which will use package and calculate total marks and percentage.


import mca.Student; 						// Importing the Student class from the 'mca' package
import java.util.Scanner;						//scanner class import from util package

class StudentMain							//class created
{
	public static void main(String args[])			//main method created
	{
		String nm;        // To store student name		//variable declaration
		int roll;            // To store student roll no.
		Scanner sc=new Scanner(System.in);		//scanner method object is created
		
		System.out.println("***** Enter Students Details *****");    // Input student's details
		System.out.print("Enter Your Name: ");
		nm=sc.nextLine();
		
		System.out.print("Enter Your Roll No: ");
		roll=sc.nextInt();
		
		System.out.println("Enter Your 3 Subjects Marks out of 100:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		// Create a Student object with the provided details
		Student s=new Student(nm,roll,m1,m2,m3);			//student class object is created
		
		// Display the student's details and marks
		s.display();									//display method called using student class object
			
	}
}
