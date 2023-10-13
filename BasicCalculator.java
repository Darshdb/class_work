//WAP to create basic calculator using switch case

import java.util.Scanner;

class BasicCalculator
{
public static void main(String args[])
{
Double a,b;
int ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Performing Operation 1-Addition, 2-Subrtraction, 3-Multiplication, 4-Division");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the 1st number:");
a=sc.nextDouble();
System.out.println("Enter the 2nd number:");
b=sc.nextDouble();
System.out.println("Addition="+(a+b));
break;

case 2:
System.out.println("Enter the 1st number:");
a=sc.nextDouble();
System.out.println("Enter the 2nd number:");
b=sc.nextDouble();
System.out.println("Subtraction="+(a-b));
break;

case 3:
System.out.println("Enter the 1st number:");
a=sc.nextDouble();
System.out.println("Enter the 2nd number:");
b=sc.nextDouble();
System.out.println("Multiplication="+(a*b));
break;

case 4:
System.out.println("Enter the 1st number:");
a=sc.nextDouble();
System.out.println("Enter the 2nd number:");
b=sc.nextDouble();
System.out.println("Division="+(a%b));
break;

default:
System.out.println("Invalid Input");
break;
}
}
}