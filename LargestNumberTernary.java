//Program to find the largest number among three numbers using ternary operator:

import java.util.Scanner;

public class LargestNumberTernary 
{
    public static void main(String[] args) 
{
	int num1,num2,num3,largest;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        num3 = sc.nextInt();

        largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);

       
    }
}