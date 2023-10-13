
//Q6-WAP to accept score of two team(say India and Pakistan based on score make a decision who won the match?

import java.util.Scanner;									//import scanner class from the util package

class MatchScore										//class define
{
	public static void main(String[]args)						//main method started
	{
		int india,pakistan,australia;						//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter the score of india team:");
		india=sc.nextInt();
		System.out.println("Enter the score of pakistan team:");
		pakistan=sc.nextInt();
		System.out.println("Enter the score of australia team:");
		australia=sc.nextInt();


		if(india>pakistan && india >australia)						//condition checking
		{
			System.out.println("The india has won the match");
		}
		else if(australia>pakistan)
		{
			System.out.println("The australia has won the match");
		}
		else
		{
			System.out.println("The pakistan has won the match");
		}
		
}
}