class MyTask extends Thread
{
	public void run()
	{
		for(int doc=1;doc<=10;doc++)
		{
			System.out.println("@@@ Document is#"+ doc+" printer 2");
		}
	}
}
public class App
{
	public static void main(String[]args)
	{
		//job1
		System.out.println("-----Application started-----");

		//job2
		MyTask task=new MyTask();
		task.start();

		//job3
		for(int doc=1;doc<=10;doc++)
		{
			System.out.println("printing document#"+doc+"printer1");
		}
		
		//job4
		System.out.println("-----Application terminated-----");
	}
}