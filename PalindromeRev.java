/* Q-3)WAP to implement multithreading for reversing user input as integer number and reverse that number in one thread and create another thread to check whether that number is palindrome or not. apply proper methods. */

class Reverse extends Thread 					//reverse thread
{
	private int num, rev = 0;				//declaration of variables

	public Reverse(int num) 
	{
		this.num = num;
	}

	public void run() 
	{
		int rem, rev = 0;				//declaration of variables
		while(num > 0)					//reverse operation
		{
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("The reverse of the numbers are : " + rev);
	}

	public int getReversedNumber() 
	{
		return rev;
	}
}

class Palindrome extends Thread 					//Palindrome thread
{
	private int num;
	public Palindrome(int num) 
	{
		this.num = num;					
	}

	public void run() 
	{
		int rev = new Reverse(num).getReversedNumber();
		int rem,pal=0,input;				//declaration of variables
		input=num;

		while(num>0)					//palindrome operation
		{
			rem = num % 10;
			pal = (pal * 10) + rem;
			num = num / 10;
		}
		if(pal == input)
		{
			System.out.println(input+" is a Palindrome number.");
		}
		else
		{
			System.out.println(input+" is not a Palindrome number.");
		}
	}
}

public class PalindromeRev
{
	public static void main(String[] args) 
	{
		
		System.out.print("Enter an integer: ");
		int userInput = Integer.parseInt(System.console().readLine());	//taking user input

		Reverse r = new Reverse(userInput);
		r.start();					//calling reverse of operation 

		try
		{
			r.join(); 				// Wait for the reverse thread to complete
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		Palindrome p = new Palindrome(userInput);
		p.start();					//calling palindrome operation
	}
}