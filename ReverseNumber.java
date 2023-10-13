//Q24-WAP to accept number from  user and do reverse of it.

import java.util.Scanner;								//import scanner class from util package
class ReverseNumber   								//class started
{  
	public static void main(String[] args)   				//main method started
	{  
		int number, reverse = 0,rem;  					//variable declaration
		Scanner sc=new Scanner(System.in);			//scanner method object created
		System.out.println("Enter a number");
		number=sc.nextInt();
	while(number>0)   								//while loop checks the condition of number is not equal to 0
	{  
		rem = number % 10;  						//rem store the number mod by10
		reverse = reverse* 10 + rem;  					//reverse stores the 10+rem
		number = number/10;  						//number is devide by 10
	}  
		System.out.println("The reverse of the given number is: " + reverse);  //print the output
}  
}  