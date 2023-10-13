//WAP to create two threads...one thread will generate even numbers between 1 and 50 and another thread will generate odd numbers  between 1 and 50
import java.util.Scanner;

class EvenNum extends Thread
{
	public void run()
	{
		for(int num=1;num<=50;num++)
		{
			if(num%2==0)
			{
			System.out.println("Even Numbers:"+num);
			}
		}
	}
}

class OddNum extends Thread
{
	public void run()
	{
		for(int num=1;num<=10;num++)
		{
			if(num%2!=0)
			{
			System.out.println("Odd Numbers:"+num);
			}
		}
	}
}
public class App1
{
	public static void main(String[]args)
	{
		//job1
		System.out.println("-----Application started-----");

		//job2
		EvenNum en=new EvenNum();
		en.start();
		OddNum od=new OddNum();
		od.start();

		//job3
		System.out.println("-----Application terminated-----");
	}
}