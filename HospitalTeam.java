//Q41-Create a program in java to implement multilevel inheritance and hierarchical inheritance.Take classes like: Doctor, Surgeon and Nurse

class Doctor
{	
	public void doctors()
	{
	System.out.println("This are about civil hospital doctores");
	}
}
class Surgeon extends Doctor
{	
	public void doctors()
	{
	super.doctors();
	System.out.println("This is a surgery specialist in civil hospital");
	}
}
class Nurse extends Doctor
{	
	public void doctors()
	{
	System.out.println("This is working as a nurse in civil hospital");
	}
}
class HospitalTeam
{
	public static void main(String[]args)
	{
		Surgeon sg=new Surgeon();
		sg.doctors();
		Nurse n=new Nurse();
		n.doctors();
	}
}