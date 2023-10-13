//Q.3)Create a class Student having rool_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result.

import java.util.Scanner;											//import scanner class from util package
class Student													//class student define
{
	String studName;											//variable declaration
	int rollNo,total,marathi,hindi,english,mathematics,science;
	float percentage;
	Scanner sc=new Scanner(System.in);							//scanner class object is created
	
	public void inputData()										//inputData method for get the input from user
	{
		System.out.println("Enter your personal information below");
		System.out.println("Enter your name:");
		studName=sc.nextLine();
		System.out.println("Enter your roll number:");
		rollNo=sc.nextInt();

		System.out.println("Enter your marks as per subject:");
		System.out.println("Enter your marks in marathi:");
		marathi=sc.nextInt();
		System.out.println("Enter your marks in hindi:");
		hindi=sc.nextInt();
		System.out.println("Enter your marks in english:");
		english=sc.nextInt();
		System.out.println("Enter your mathematics:");
		mathematics=sc.nextInt();
		System.out.println("Enter your science:");
		science=sc.nextInt();
	}
}
class MarkDetails extends Student									//class MarkDetails is extends a Student class properties and create own properties
{
	public void displayresult()										//displayresult method for calculate and display the result 
	{
		total=marathi+hindi+english+mathematics+science;
		percentage=total/5;
		
		System.out.println("					!!!Student Personal Information!!!");
		System.out.println("Student Name:"+studName);
		System.out.println("Student Roll Number:"+rollNo);
	
		System.out.println("					!!!Student All Subject Marks!!!");
		System.out.println("Marathi Subject Marks:"+marathi);
		System.out.println("Hindi Subject Marks:"+hindi);
		System.out.println("English Subject Marks:"+english);
		System.out.println("Mathematics Subject Marks:"+mathematics);
		System.out.println("Science Subject Marks:"+science);
		System.out.println("					Total Obtained Marks:"+total);
		System.out.println("					Percentage Of The Marks:"+percentage);
		
	}
}
class Result 													//class Result for writen a main method
{
	public static void main(String[]args)								//main method created
	{
		MarkDetails md=new MarkDetails();							//class MarkDetails object is created
		md.inputData();											//using MarkDetails class object inputData method is called
		md.displayresult();										//using MarkDetails class object displayresult method is called
	}
}