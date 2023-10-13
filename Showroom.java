/*Q29-Mr.John wants to buy a car but he needs color of the car as blue.And In Car showroom THere Are black,white,Red and blue cars Are available.Now Accept some basic Information from the user and based on that make decision whether blue car is available or not.
Basic info(Cust_name,brand,color)
Based on that color print a msg  "john Congradulation you purchased your dream car of blue color +brand
*/

import java.util.Scanner;
class Showroom{
public static void main(String args[])
{
String cust_name,car_brand,car_color;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
cust_name=sc.nextLine();
System.out.println("Welcome!!!"+cust_name);
System.out.println("Which type of car are you looking for?");
System.out.println("Black,White,Red,Blue colors are available in our showroom.");
System.out.println("Please mention the car brand.");
car_brand=sc.nextLine();
System.out.println("Please mention the car color...");
car_color=sc.nextLine();
System.out.println("Great choice!!!");
System.out.println("This color is match in our available stock");
if(car_color=="Blue" || car_color=="Red")
{
System.out.println("Congratulations Sir For Purchase This Car");
}
}
}
