public class ThreadExample extends Thread
{
	public void run()
	{
		System.out.println("Running my thread");
	}
public static void main(String[]args)
{
	//job1
	System.out.println("this is my first example");
	//job2
	ThreadExample obj=new ThreadExample();
	obj.start();	
	//job3
	for(int i=1;i<=10;i++)
	{
		System.out.println("Hello world print"+i);
	}
}
}