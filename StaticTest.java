//Underatanding static and non static method
class SDemo
{
	int res;
	public void add(int a,int b) // non static method
	{
		res=a+b;
		System.out.println("The addition is"+res);
	}
	static int multiply(int a,int b)  //static method
	{
		return a*b;
	}
	double div(int a,int b)
	{
		return (a/b);
	}
}	
public class StaticTest
{
	public static void main(String[]args)
	{	
		SDemo obj=new SDemo();
		obj.add(3,8);
		System.out.println("The Multiplication is"+SDemo.multiply(6,8));
		System.out.println(obj.div(51,5));
	}
}
