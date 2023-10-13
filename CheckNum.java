import java.util.Scanner;
class CheckNum
{
	public static void main(String[]args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		num1=sc.nextInt();
		System.out.println("Enter a second number");
		num2=sc.nextInt();

		if(num1>num2)	//this returns boolean expression True or False
		{
			System.out.println("num1 is greater than num2");
		}
		else
		{	
			System.out.println("num2 is greater than num1");
		}
}
}