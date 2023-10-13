//Use of multiple catch statement
public class MultipleCatchBlock{
	public static void main(String[]args){
	try{
		int a[]=new int[5];
		a[5]=30/5;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBounds Exception occures");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception occures");
	}
	catch(Exception e)
	{
		System.out.println("Parent class Exception occures");	
	}
		System.out.println("Rest of the code");
}
}