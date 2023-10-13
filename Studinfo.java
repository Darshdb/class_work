/*Q34-WAP that takes Basic information of student and Display the same.Add two more methods in the same program which are related to Student class.*/
import java.util.Scanner;

class Student{
	
	String name;
	int rollno,total;
	int age;
	int english,science,math,hindi,marathi;
	double percentage,average;
	public void getinfo()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.nextLine();
	System.out.println("Enter your roll no:");
	rollno=sc.nextInt();
	System.out.println("Enter your age:");
	age=sc.nextInt();
	System.out.println("Enter the english subjects marks:");
	english=sc.nextInt();
	
	System.out.println("Enter the science subjects marks:");
	science=sc.nextInt();
	
	System.out.println("Enter the math subjects marks:");
	math=sc.nextInt();
	
	System.out.println("Enter the hindi subjects marks:");
	hindi=sc.nextInt();
	

	System.out.println("Enter the marathi subjects marks:");
	marathi=sc.nextInt();
	
	
	}

	void putinfo()
	{
	System.out.println("Student Name:"+name);
	System.out.println("Student Roll No:"+rollno);
	System.out.println("Student Age:"+age);
	}
	void scholarshipEligibility()
	{
	
		total=english+science+math+hindi+marathi;
		average=total/5;
		percentage=(total/500)*100;
	System.out.println("The average is"+average);
	System.out.println("The percentage is"+percentage);

		if(percentage>=90)
		{
			System.out.println("This student is eligible for scholarship from gov");
		}
		else
		{
			System.out.println("This student is not eligible for scholarship");
		}
	}	
}
public class Studinfo
{
	public static void main(String[]args)
	{
		Student std=new Student();
		std.getinfo();
		std.putinfo();
		std.scholarshipEligibility();
	}
}

	

