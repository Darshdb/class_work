//Q12-Amar" is HDFC bank customer his Balance is 25000. After  some time He trasfered 11000 amount to his friend "Surya".Print the current balance and find interest value on that amount with interest value 2%  and 12months?

import java.util.Scanner;										//import the scanner class from util packege

class ClientAmar											//define the class
{
	public static void main(String[]args)						//main method started
	{
		int amar_alc=25000,surya_alc=0,interest ;				//variable declaration
	
		System.out.println("Amar current account balance is:"+amar_alc);
		System.out.println("Surya current account balance is:"+surya_alc);

		amar_alc=amar_alc-11000;
		surya_alc=surya_alc+11000;		 

		
			System.out.println("Now amar account balance is:"+amar_alc);

			interest=surya_alc/100*2;

			System.out.println("Now surya account balance is:"+surya_alc);
			
			System.out.println("Interest of amar given money to surya for 12 months is:"+interest);

		
}
}