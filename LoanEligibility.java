/* Q.3)WAP to check whether the person is eligible for getting loan or not.

        Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.Otherwise Loan can't be given to customer.
*/

import java.util.*;											//import the java pre defined util package

class LoanEligibility											//class started
{
	public static void main(String[]args)							//main method started
	{
		double salary;										//variable declaration
		int choice;
	
		Scanner sc=new Scanner(System.in);					//scanner method object created
		System.out.println("If you from india Press 1 For NRI Press 0");
		choice=sc.nextInt();
		System.out.println("Please enter your salary:");				//ask user to enter their salary
		salary=sc.nextDouble();
			
		if(choice==1 && salary>=50000)						//check if user is indian and salary is more than 50000 then it will be eligible for loan
		{
			System.out.println("This person is eligible for loan");		//print the output based on condition checking
		}
		else
		{
			System.out.println("This person is not eligible for loan");	
		}

	}
}