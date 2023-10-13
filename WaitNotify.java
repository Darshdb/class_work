

class Customer
{
	int amount=10000;

	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw...");
	if(this.amount<amount)
	{
		System.out.println("Less balance; waiting for deposite...");
	try{wait();}
	catch(Exception e){ }
	}
	this.amount=this.amount-amount;
	System.out.println("withdraw completed...");
	}
	synchronized void deposite(int amount)
	{
		System.out.println("going to deposite...");
		this.amount=this.amount+amount;
		System.out.println("deposite completed...");
		notify();
	}
}
class WaitNotify
{
	public static void main(String[]args)
	{
		Customer c=new Customer();
	new Thread()
	{
		public void run()
		{c.withdraw(15000);}
	}.start();
	
	new Thread()
	{
		public void run()
		{c.deposite(10000);}
	}.start();
}
}