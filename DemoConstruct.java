class Emp
{
	String name;
	int age;

	public void display()
	{
		System.out.println("Welcome to employee details");
	}
	public Emp(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class DemoConstruct
{
public static void main(String[]args)
{
	Emp e=new Emp("Darshan",22);
	System.out.println(e.name+" "e.age);
	e.display();
}
}
