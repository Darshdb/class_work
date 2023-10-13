/* Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
	1 to 100 units – Rs. 10/unit

       100 to 200 units – Rs. 15/unit

       200 to 300 units – Rs. 20/unit

       above 300 units – Rs. 25/unit
*/

import java.util.Scanner;									//import the scanner class from util package

class ComputeElectricityBill 								//define the class
{
	public static void main(String args[])						//main method started
	{
		int units;										//variable declaration
		Scanner sc=new Scanner(System.in);				//get the input from the user
		System.out.println("Enter the unit value");
		units=sc.nextInt();

		if (units>=1 && units<100)							//condition checking and print the output
		 {
			units=units*10;
			System.out.println("The unit charge is:"+units);
		}
		else if (units>=100 && units<200) 
		{
			units=(100*10)+(units-100)*15;
			System.out.println("The unit charge is:"+units);
		}
		else if (units>=200 && units<300)
		 {
			units=(100*10)+(100*15)+(units-200)*20;
			System.out.println("The unit charge is:"+units);
		}
		else if (units>=300)
		 {
			units=(100*10)+(100*15)+(100*20)+(units-300)*25;
			System.out.println("The unit charge is:"+units);
		}
		else
		{

			System.out.println("Wrong value");
		}
		
	}

	
}
