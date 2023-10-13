//Q.2)WAP a program to reverse a given String without using reverse() method.

import java.util.Scanner;					//import scanner class from util package
public class StringReverse
{  
  public static void main(String args[]) 
   { 
     String str;							//variable declaration
     Scanner sc = new Scanner(System.in);		//scanner class object is created
     System.out.println("Enter a String"); 		//get the input from the user
     str = sc.nextLine();
  
    char[] ch=str.toCharArray();  				//input store into character array
    for(int i=ch.length-1;i>=0;i--)				//using for loop and length method we will start iterations in opposite direction by -1 till arrayof size is 0
     {  
      System.out.print(ch[i]);  				//after that we will print array of i
     }  
  }
}