//Create a Package Infopack and access users details in the program

package Infopack;
import java.util.Scanner;
public class UserDetails{
	

	double contact;
	String name,address;
	public void getinfo()
	{

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter user name:");
	name=sc.nextLine();
	System.out.println("Enter user address:");
	address=sc.nextLine();
	System.out.println("Enter user contact number:");
	contact=sc.nextDouble();
}
	public void display()
	{
		System.out.println("User Name:"+name);
		System.out.println("User Address:"+address);
		System.out.println("User Contact Number:"+contact);
	}
public static void main(String[]args){

	UserDetails ud=new UserDetails();
	ud.getinfo();	
	ud.display();
							
}
}