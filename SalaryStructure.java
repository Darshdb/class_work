/*WAP to implement  hierarchical inheritance .Create a class Employee with fields id,name,salary.Create  two more classes PermantEmp and ContractEmp in that add hike() method to display percentage hike in the salary
permantEmployee hike is 10% of the salary and contractEmployee salary will be  hiked by 5% of salary*/

import java.util.Scanner;

class Employee
{
	int empid,salary=0;
	String name;
	Scanner sc=new Scanner(System.in);

	public void input()
	{
		System.out.println("Enter the employee name:");
		name=sc.nextLine();
		System.out.println("Enter the employee id:");
		empid=sc.nextInt();
		System.out.println("Enter the employee salary:");
		salary=sc.nextInt();
	}
}
class PermanentEmp extends Employee
{	
	public void salaryhike()
	{
		salary=(salary*10)/100+salary;
		System.out.println("The contract employee salary after 10% hike:"+salary);

		
	}
}
class ContractEmp extends Employee
{
	public void salaryhike()
	{
		salary=(salary*5)/100+salary;
		System.out.println("The contract employee salary after 5% hike:"+salary);
	}
}
class SalaryStructure
{
	public static void main(String[]args)
	{
		Scanner st=new Scanner(System.in);
		System.out.println("Select the type of employee, press 1 for permanent press 2 for contract:");
		int employeetype=st.nextInt();
		if(employeetype==1)
		{
		PermanentEmp pe=new PermanentEmp();
		pe.input();
		pe.salaryhike();
		}
		if(employeetype==2)
		{
		ContractEmp co=new ContractEmp();
		co.input();
		co.salaryhike();
		}
	}
}
				
		
