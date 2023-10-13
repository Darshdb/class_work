//Q.2)WAP to swap two numbers without using third variable

import java.util.Scanner;					//import the java package for scanner
class SwapNumbers 						//define the class
{				
	 int first=0, second=0;				//variable declaration
	
    	public void swap()
	{
       
	Scanner sc=new Scanner(System.in);		//scanner method object created

	System.out.println("Enter the first number:");	//take inputs from user
	first=sc.nextInt();
        System.out.println("Enter the second number:");
	second=sc.nextInt();
	System.out.println("Before changing:");
        System.out.println("First number :" + first);
        System.out.println("Second number :" + second);


       											 //logic applied here
        first = first+second;
	second = first-second;
	first = first-second;

        System.out.println("After changing:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
}
}
public class Swap2
{
	public static void main(String[] args)           		//main method started
{
	SwapNumbers sn=new SwapNumbers();			//SwapNumbers class object is created
	sn.swap();									//using SwapNumbers class object swap method is called

}
    }

