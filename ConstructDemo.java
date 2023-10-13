class Dog
{
	String name;
	int age;
public Dog(String name,int age)
{
	this.name=name;
	this.age=age;
}
}
public class ConstructDemo
{
	public static void main(String[]args)
	{
		Dog mydog=new Dog("Tommy",4);
		System.out.println(mydog.name);
		System.out.println(mydog.age);
	}
}