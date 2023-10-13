//Q41-WAP to get details  of vehicle i.e. Bike and Car.Override engine() method to describe both bike and car create Vehicle as base class and BIke ,Car as derived class using method overriding

class Vehical
{
	public void engine()
	{
	System.out.println("There are two types of vehical available in our showroom with Bike and Car both are having turbo engine");
	}
}
class Car extends Vehical
{
	public void engine()
	{	
		super.engine();
		System.out.println("The Grand i10 is having 1200cc engine");
	}
}
class Bike extends Vehical
{
	public void engine()
	{
		
		System.out.println("The Bullet is having 350cc engine");
	}
}
class Overriding
{
	public static void main(String[]args)
	{
		Bike bk=new Bike();
		Car c=new Car();
		c.engine();
		bk.engine();
	}
}