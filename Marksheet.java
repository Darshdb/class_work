/*Q39-WAP to generate Marksheet of a student based on His personal details and Secured marks.Create PersonalInfo class for accepting student personal information and Create another class MarksInfo for Accepting students marks details and finally create Result class to display all above class information using multilevel Inheritance.*/

import java.util.*;
class PersonalInfo
{
	String studName,boardName;
	int rollNo,seatNo,passYear,total,marathi,hindi,english,mathematics,science;
	float percentage;
	Scanner sc=new Scanner(System.in);
	
	public void inputData()
	{
		System.out.println("Enter your personal information below");
		System.out.println("Enter your name:");
		studName=sc.nextLine();
		System.out.println("Enter your board name:");
		boardName=sc.nextLine();
		System.out.println("Enter your roll number:");
		rollNo=sc.nextInt();
		System.out.println("Enter your seat number:");
		seatNo=sc.nextInt();
		System.out.println("Enter your passing out year:");
		passYear=sc.nextInt();

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
class MarksInfo extends PersonalInfo
{
	public void Marks()
	{
		total=marathi+hindi+english+mathematics+science;
		percentage=total/5;
		
	}
}
class Result extends MarksInfo
{
	public void displayresult()
	{	
		System.out.println("Student Personal Information");
		System.out.println("Student Name:"+studName);
		System.out.println("Board Name:"+boardName);
		System.out.println("Student Roll Number:"+rollNo);
		System.out.println("Student Seat Number:"+seatNo);
		System.out.println("Student Passing Out Year:"+passYear);
		System.out.println("Student All Subject Marks");
		System.out.println("Marathi Subject Marks:"+marathi);
		System.out.println("Hindi Subject Marks:"+hindi);
		System.out.println("English Subject Marks:"+english);
		System.out.println("Mathematics Subject Marks:"+mathematics);
		System.out.println("Science Subject Marks:"+science);
		System.out.println("Total Obtained Marks:"+total);
		System.out.println("Percentage Of The Marks:"+percentage);
	}
}
public class Marksheet
{
	public static void main(String[]args)
	{
		Result rs=new Result();
		rs.inputData();
		rs.Marks();
		rs.displayresult();
	}
}