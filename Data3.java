//Q35-Create a class Person with two private data members name and age .Perform Encapsulation on these fields
class Info{
	private String name;
	private int age;

	//getter method
	public String getName(){
	return name;
	}
	//setter method
	public void setName(String name){
	this.name=name;
	}
	public int getAge(){
	return age;
	}
	public void setAge(int age){
	this.age=age;
	}
}
public class Data3{
	public static void main(String[]main){
	Info d=new Info();

	//access the privatre variable using the getter and setter
	d.setName("Ganesha");
	d.setAge(22);
	System.out.println(d.getName());
	System.out.println(d.getAge());
}
}