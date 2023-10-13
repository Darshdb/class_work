//User input as a string comparison

import java.util.Scanner;
class StringDemo1{
public static void main(String args[])
{
String str1,str2="Hello";
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
str1=sc.nextLine();
System.out.println("Welcome!!!"+str1);
System.out.println("str2");

if(str1.equals(str2))
{
System.out.println("Both the strings are equal");
}
}
}