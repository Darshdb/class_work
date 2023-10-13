//Q.1)WAP to search given student name is available in the list of student name using String array.

import java.util.Scanner;									//import Scanner class from util package
class FindNameArray
 {
  public static void main(String args[])
   {
     String name;
     String input;										//variable declaration
     int i;
     int flag=0;
    
     String arr[]= new String[5];								//array created and assign the size
    
     Scanner sc = new Scanner(System.in);						//scanner class object is created
     System.out.println("Enter name of 5 Student");				
    for( i=0;i<5;i++)
      {
         arr[i] = sc.nextLine();									//using for loop get the inputs from user and store in the array which we will create
        
      }
    
     System.out.println("-----------------------------------------------------");
       System.out.println();
 
       System.out.println("Enter Student name which you find in the list!!! ");		//ask user to input which you find in the list
     input = sc.nextLine();
     for (i=0;i<5;i++)
       {
  
      
       if(input.equals(arr[i]))											//in for loop check input  is equals to array list or not using equals method
         {
           
           flag =1;
           break;
         }
       }
       if(flag==1)													//if input match to the array list print below statement other wise else statement
         {
            System.out.println(input+" is present in a list at position : "+(i+1));
         }
      else
         {
            System.out.println(input+" is not present in a list ");
         }
       
   }
}