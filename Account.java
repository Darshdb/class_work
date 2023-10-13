//Q38-Create a bank class with withdraw and deposit methods.assign balance amount and perform the said Operations using single inheritance

import java.util.Scanner;
class Bank
{
	public float balance=50000,amount=0;
	Scanner sc=new Scanner(System.in);
	public void deposite()
	{
		System.out.println("Your preveous balance is:"+balance);
		System.out.println("Enter a deposite amount:");
		amount=sc.nextFloat();
		balance =balance+amount;
		System.out.println("Your current balance is:"+balance);
	}
}
class Customer extends Bank
{
	public void withdraw()
	{
		System.out.println("Enter a withdraw amount:");
		amount=sc.nextFloat();
		balance =balance-amount;
		System.out.println("Your current balance is:"+balance);
	}
}
public class Account
{
	public static void main(String[]args)
	{
		Customer c=new Customer();
		c.deposite();
		c.withdraw();
	}
}
		