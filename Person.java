//Q34-WAP to create a class Person with Data members as ubique_id,name,age,city and gender also include methods study() sleep() and play().

import java.util.Scanner;

class Person1
{
	int unique_id,age;
	String name,city,gender;

	public void getinfo()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your unique id:");
		unique_id=sc.nextInt();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		System.out.println("Enter your city:");
		city=sc.nextLine();
		System.out.println("Enter your gender:");
		gender=sc.nextLine();
}
	public void putinfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Unique Id:"+unique_id);
		System.out.println("Age:"+age);
		System.out.println("City:"+city);
		System.out.println("Gender:"+gender);
}
	public void study()
	{
		System.out.println("My study time is after lunch");
	}
	public void sleep()
	{
		System.out.println("My sleeping time is 12am & Wakeup time is 5am");
	}
	public void play()
	{
		System.out.println("My playing time is after dinner");
	}
}
	public class Person
	{
		public static void main(String[]args)
		{
			Person1 ps=new Person1();
			ps.getinfo();
			ps.putinfo();
			ps.study();
			ps.sleep();
			ps.play();
		}
	}
		
		