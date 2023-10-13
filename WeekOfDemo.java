//WAP to make decision which day is your weekly off.

import java.util.Scanner;

class WeekOfDemo
{
	public static void main(String[]args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 for your weekly off:");
		ch=sc.nextInt();

	switch(ch)
	{
		case 1:
			System.out.println("Your weekly off is monday!!!");
			break;
		case 2:
			System.out.println("Your weekly off is tuesday!!!");
			break;
		case 3:
			System.out.println("Your weekly off is wednesday!!!");
			break;
		case 4:
			System.out.println("Your weekly off is thursday!!!");
			break;
		case 5:
			System.out.println("Your weekly off is friday!!!");
			break;
		case 6:
			System.out.println("Your weekly off is saturday!!!");
			break;
		case 7:
			System.out.println("Your weekly off is sunday!!!");
			break;
		default:
			System.out.println("No weekly off to you as invalid input");
}
}
}