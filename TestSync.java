class Table
{
synchronized void printTable(int n)
{ 							//method not synchronized
	for(int i=1;i<=10;i++)
	System.out.println(n*1);
	try{
		Thread.sleep(400);
	}
	catch(Exception e)
	{
	 System.out.println(e);
	}
}
}
class MyThread1 extends Thread{
Table t;
MyThread1(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(5);
}
}
class MyThread2 extends Thread
{
Table t;
MyThread2(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(25);
}
}
class TestSync
{
public static void main(String[]args)
{
Table obj=new Table();	//only object
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}