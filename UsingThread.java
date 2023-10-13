class Myth1 extends Thread
{
@override
	public void run()
	{
		int i=0;
		while(i<400)
		{
		System.out.println("Thread 1 is running");
		System.out.println("I am sad");
		}
	}
}
class Myth2 extends Thread
{
@override
	public void run()
	{
		int i=0;
		while(i<400)
		{
		System.out.println("Thread 2 is running");
		System.out.println("I am happy");
		}
	}
}
public class UsingThread
{
public static void main(String[]args)
{
	Myth1 m1=new Myth1();
	Myth2 m2=new Myth2();

	m1.start();
	m2.start();

}
}