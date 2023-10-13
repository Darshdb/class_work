//Q13-WAP to accept number from the user ,if it is odd find cube of it otherwise find square of that number.(Do not accept input as zero)

import java.util.Scanner;

class Cube
{
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();

		if(num==0)
		{ 
			System.out.println("Input zero is not acceptable");
		
		}
		else if(num%2!=0)
		{ 
			System.out.println("The square of this number is:"+num*num);
		
		}
		else if(num%2==0)
		{

			System.out.println("The cube of this number is:"+num*num*num);
		}
		
}
}
		