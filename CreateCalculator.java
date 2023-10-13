//WAP to create mini calculator for performing operation until user want to continue.

import java.util.Scanner;

class CreateCalculator
{
	public static void main(String[]args)
	{
		char operator;
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, % or /");
		operator=sc.next().charAt(0);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();


	switch(operator)
	{
		case '+':
			System.out.println("The addition of this two numbers is:"+(num1+num2));
			break;
		case '-':
			System.out.println("The subtraction of this two numbers is:"+(num1-num2));
			break;
		case  '*':
			System.out.println("The multiplication of this two numbers is:"+(num1*num2));
			break;
		case '%':
			System.out.println("The modulus of this two numbers is:"+(num1%num2));
			break;
		case '/':
			System.out.println("The division of this two numbers is:"+(num1/num2));
			break;
		default:
			System.out.println("Invalid input");
}
}
}
