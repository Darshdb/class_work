package vehicles;
public class Car implements Vehicle
{
	public void run()
	{
		System.out.println("Car is running");
	}
	public void speed()
	{
			System.out.println("Speed of Car is 50kmph");
	}
	public static void main(String[]args)
	{
	Car r=new Car();
	r.run();
	r.speed();
		System.out.println("Hello World");
}
}