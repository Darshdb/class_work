class MythRunnable1 implements Runnable
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
class MythRunnable2 implements Runnable
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

public class UsingRunnable
{
	public static void main(String[]args)
	{
		MythRunnable1 myth1= new MythRunnable1();
		Thread th1=new Thread(myth1);
		MythRunnable2 myth2= new MythRunnable2();
		Thread th2=new Thread(myth2);

		th1.start();
		th2.start();
	}
}