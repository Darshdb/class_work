public class ThreadExample1 implements Runnable
{
	public void run()
	{
		System.out.println("In case of multiple inheritance we should go for Runnable inter");
	}
public static void main(String[]args)
	ThreadExample1 obj=new ThreadExample1();
	Thread t=new Thread(obj);
	t.start();
	}
}