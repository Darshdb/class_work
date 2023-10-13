//Student class with private fields:roll no,name,age,address.and public getter & setters

package std;

public class Student3 implements java.io.Serializable
{
	private int rollno,age;
	private String name,address;
	public Student3()
	{

	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
}