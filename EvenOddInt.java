//Q2-Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;												//import the scanner class from util packege
public class EvenOddInt												//define the class
{

    public static void main(String[] args) 									//main method started
{

        Scanner sc = new Scanner(System.in);								//Scanner class object is created

        int number, chioce, evenSum = 0, OddSum = 0;							//variable declaration

        do {															// starting do

            System.out.print("Enter the number ");								//print the msg for user to input the number

            number = sc.nextInt();											//get the input



            if (number % 2 == 0) {											//check the condition input number devide by two and reminder is zero 

                evenSum += number;

            } 
	   else {														//else part

                OddSum += number;

            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");	//print the msg to ask the user they can continue to check other number or get the output

            chioce = sc.nextInt();

        } 
	while (chioce == 1);												//check condition trough while user choice 1 then print below 

        System.out.println("Sum of even numbers: " + evenSum);					//print the sum of even number

        System.out.println("Sum of odd numbers: " + OddSum);					//print the sum of odd number

    }

}



