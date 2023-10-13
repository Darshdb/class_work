import Empdetails.Emp;
import java.util.*;
class Empinfo
{
	public static void main(String[]args)
	{
		String ename,edesignation;
		int eid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		eid=sc.nextInt();
		System.out.println("Enter a employee name:");
		ename=sc.nextLine();
		System.out.println("Enter the employee designation:");
		edesignation=sc.nextLine();
		Emp e=new Emp(eid,ename,edesignation);
		e.display();
}
	
}
