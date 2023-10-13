//Q1-Write a Package MCA which has one class Student. Accept student detail through parameterized constructor. Write display () method to display details. Create a main class which will use package and calculate total marks and percentage.


package mca;			//package declaration
public class Student		 // Defining the Student class
{ 
	public String name;    // variable declaration in public access modifier
	public int r_no;
	public int a,b,c;
	int sum=0;
	
	public Student(String nm, int roll, int m1, int m2, int m3)  // Constructor to initialize student information
	{
		name = nm;
		r_no=roll;
		a = m1;
		b = m2;
		c = m3;
		sum=a+b+c;            // Calculate total marks
	}
	
		public void display()     // Method to display student details and marks
	{
		System.out.println("---------- Student Details ----------------");
		System.out.println("Full Name  : "+name);
		System.out.println("Roll No    : "+r_no);
		System.out.println("----------- Marks ---------");
		System.out.println("Subject 1  : "+a);
		System.out.println("Subject 2  : "+b);
		System.out.println("Subject 3  : "+c);
		System.out.println("---------------------------");
		System.out.println("Total Marks: "+sum);
		System.out.println("Percentage : "+sum/3+ "%");
		System.out.println("****************************");
	}
	
}
