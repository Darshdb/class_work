// Q7-st.xavior school display a notice on the school notice board regarding admission in std.xi for choosing different streams, according to marks in english, math and science in ICSE examination.

import java.util.Scanner;									//import the scanner class from util packege

class StreamSelection									//define the class
{
	public static void main(String[]args)						//main method started
	{
		int math,english,science;							//variable declaration
	
		Scanner sc=new Scanner(System.in);				//get the inputes from the user
		System.out.println("Enter your maths marks:");
		math=sc.nextInt();
		System.out.println("Enter your english marks:");
		english=sc.nextInt();
		System.out.println("Enter your science marks:");
		science=sc.nextInt();
		
		if(math>=80 && english>=80 && science>=80)									//check the condition and print the exact output
		{
			System.out.println("Eligible to pure science stream");
		}
		else if(english>=80 && science>=80 && math>=60)
		{
			System.out.println("Eligible to bio science stream");
		}
		else if(math>=60 && english>=60 && science>=60)
		{
			System.out.println("Eligible to commerce stream");
		}
		else
		{
			System.out.println("This is not admisible");
		}
}
}