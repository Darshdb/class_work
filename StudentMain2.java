//Student class with private fields:roll no,name,age,address.and public getter & setters

import std.Student3;

public class StudentMain2
{
	public static void main(String[]args)
	{
		Student3 st=new Student3();
	
	st.setRollno(38);
	System.out.println("Student roll number is:"+st.getRollno());
	st.setAge(22);
	System.out.println("Student age is:"+st.getAge());
	st.setName("Darshan");
	System.out.println("Student name is:"+st.getName());
	st.setAddress("Nashik");
	System.out.println("Student Address is:"+st.getAddress());
}
}
