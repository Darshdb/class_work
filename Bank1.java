//Q38-Create a bank class with withdraw and deposit methods.assign balance amount and perform the said Operations

import java.util.Scanner;
class Bank
{
	public float balance=50000,amount=0;
	Scanner sc=new Scanner(System.in);
	public void Deposite()
	{
		System.out.println("Your preveous balance is:"+balance);
		System.out.println("Enter a deposite amount:");
		amount=sc.nextFloat();
		balance =balance+amount;
		System.out.println("Your current balance is:"+balance);
	}
	public void Withdraw()
	{
		System.out.println("Enter a withdraw amount:");
		amount=sc.nextFloat();
		balance =balance-amount;
		System.out.println("Your current balance is:"+balance);
	}
}
	public class Bank1
{
	public static void main(String[]args)
	{
		Bank bk=new Bank();
		bk.Deposite();
		bk.Withdraw();
	}
}

		