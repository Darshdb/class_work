/*Q30-WAP to  calculate interest rate of Fixed deposite or Saving intertest based on choice provided by user whether he wants to keep money for fixed deposite or saving .Interest Rate for fixed Deposit is 7 % and for saving it is 3.5%*/

import java.util.Scanner;

class RateOfInterest
{
	public static void main(String[]args)
	{
		double principal,time,depo_int=7,sav_int=3.5;
		String ch;

		Scanner sc=new Scanner(System.in);

		System.out.println("Welcome sir!!!");
		System.out.println("Fix deposite interest is:7%  &  Saving account interest is:3.5%");
		System.out.println("Where you can put your money?");
		ch=sc.nextLine();
		

		switch(ch)
		{
			case "deposite":
						System.out.println("Enter the principal:");
						principal=sc.nextDouble();
						System.out.println("Enter the time:");
						time=sc.nextDouble();
						
						depo_int=(principal*time*depo_int)/100;
						System.out.println("Your interest for your deposited value is:"+depo_int);
			break;
			case "saving":
						System.out.println("Enter the principal:");
						principal=sc.nextDouble();
						System.out.println("Enter the time:");
						time=sc.nextDouble();
						sav_int=(principal*time*sav_int)/100;
						System.out.println("Your interest for your saving value is:"+sav_int);
			break;
			default:
						System.out.println("You are not intered the integer value");
			break;
}
}
}
			
		
		
		