//Q2-Create package MyArray to accept 10 values from user import created package to find particular element from the array using binary search algorithm

package myarray; 									// Package declaration
import java.util.Scanner;								//import scanner class from util package

// Class to accept an array of integers from the user
public class AcceptArray 								//class created
{
	// Method to accept an array of integers from the user
    public static int[] acceptArray() 						//static method created
	{
        int[] arr = new int[10]; // Create an array to store 10 integers		//variable declaration
        Scanner sc = new Scanner(System.in);						//scanner class object is created
        
        System.out.println("Enter 10 elements in Array but not enter duplicate/same numbers:");
        for (int i = 0; i < arr.length; i++)								//for loop initialize
		{
            arr[i] = sc.nextInt(); 									// Read each element from the user
        }
        return arr; // Return the array								//return integer arr variable
    }
}
