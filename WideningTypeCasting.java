//WAP to accept salary from user and typecast it into double after adding bonus (11 % of salary)into it.

import java.util.Scanner;
public class WideningTypeCasting
{
public static void main(String[] args) 
{
	int salary=0;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the salary ammount:");
	salary=sc.nextInt(); 
	double grosssalary=salary+(salary/100)*11;
	
	System.out.println("Salary is:"+salary);
	System.out.println("Salary with bonus is:"+grosssalary);
}
}