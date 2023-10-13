//Calculate total salary of employee

import java.util.Scanner;
class CalGross
{
	public static void main(String[]args)
	{
		//Variable declaration
		int basicSal;
		float da;
		double hra,gross;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the basic salary:");
		basicSal=sc.nextInt();				
		System.out.println("Enter the daily allowance:");
		da=sc.nextFloat();
		System.out.println("Enter the housing rent allowance:");
		hra=sc.nextDouble();

		gross=basicSal+da+hra;
		System.out.println("The gross salary is"+gross);
}
}