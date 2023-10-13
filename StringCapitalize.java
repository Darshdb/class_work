//Q.3)Write a java program to capitalize each word in string.

import java.util.Scanner;							//import scanner class from util package
public class StringCapitalize
{  
   public static void main(String args[])
    { 
     String s1,s1upper;							//variable declaration
 
     Scanner sc = new Scanner(System.in);				//scanner class object is created
     System.out.println("Enter a String");				//get the input from user
     s1=sc.nextLine();
   
      System.out.println("String after capitalize each world ");

      s1upper=s1.toUpperCase();  					//using toUpperCase method input string is convert into capital
      System.out.println(s1upper);  					//print the string after using toUpperCase method
   }
}