public class TestFinallyBlock{
	public static void main(String[]args){
		try{
			System.out.println("Inside the try block");
			
		//below code throws divide by zero exception
		int data=25/0;
		System.out.println(data);
		}
		//cannot handle Arithmatic type exception
		//can only accept Null Pointer type exception
		catch(NullPointerException e){
			System.out.println(e);
		}
		//executes regardless of exception occured or not
		finally{
			System.out.println("finally block is always executed");
			System.out.println("This is compulsory excecuted block irrespective of exception");
		}
			System.out.println("Remaining code block...");
	}
}
			
			