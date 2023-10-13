//Q4-Write a number to get average of three numbers?

import java.util.Scanner;		// import the define package and class

class Average				// define the class
 {
  public static void main(String[] args)		// main method is started
 {

	Scanner sc=new Scanner(System.in);

        // take three numbers

	System.out.println("Enter the 1st num:");
	double num1=sc.nextDouble();
	System.out.println("Enter the 2nd num:");
	double num2=sc.nextDouble();
	System.out.println("Enter the 3rd num:");
	double num3=sc.nextDouble();



    	// declare sum variable
       // and initialize with 0
  	  double sum = 0.0;
      // declare average variable
         double avg = 0.0;

    // calculate the sum value
         sum = num1 + num2 + num3;
    // calculate the average value
         avg = sum/3;

    // display result
         System.out.println("Average: " + avg );
  }
}