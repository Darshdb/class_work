/*Mr.John wants to buy a car but he needs color of the car as blue.And In Car showroom THere Are black,white,Red and blue cars Are available.Now Accept some basic Information from the user and based on that make decision whether blue car is available or not*/

import java.util.Scanner;
class BuyCar
 {
   public static void main(String args[])
    {
       String str1,str2,str3,ch;
       
       Scanner sc= new Scanner(System.in);
	ch=sc.nextLine.charAt(0);
       
       System.out.println("Enter your Name");
       str1 =sc.nextLine;

       System.out.println("Enter brand of car you want to buy");
       str2 =sc.nextLine;
  
       System.out.println("Enter Colour name you want ");
       str3 =sc.nextLine;
    
    switch(ch)
           {
              case "black":
                         System.out.println("Congradulation you purchased your dream car of black colour of brand "+str2);
                         break;
                        
             case "white":
                         System.out.println("Congradulation you purchased your dream car of white colour of brand "+str2);
                         break;

            case "red":
                         System.out.println("Congradulation you purchased your dream car of red colour of brand "+str2);
                         break;
 
           case "blue":
                         System.out.println("Congradulation you purchased your dream car of blue colour of brand "+str2);
                         break;
          }
   }
}