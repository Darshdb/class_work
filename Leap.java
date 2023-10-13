//Q14-Write a Java program that takes a year from the user and prints whether it is a leap year or no

import java.util.Scanner;								//import scanner class from the util package
class Leap {

  public static void main(String[] args) {

        int year;										//variable declaration
	Scanner sc=new Scanner(System.in);				//get the input year from user
	System.out.println("Enter the year");
	year=sc.nextInt();
        											// if year is divided by 400
       												 // then it is a leap year
        if (year % 400 == 0)
	{
		System.out.println(year + " is a leap year.");
	}
	else if(year%4==0 && year%100!=0)
	{
		System.out.println(year+"is a leap year");
	}
        else
	{
		System.out.println(year + " is not a leap year.");
         
         }
     
  }
}
