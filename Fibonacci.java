/*Q20-fibonacci series
0   1    1    2  3     5   8 
*/
import java.util.Scanner;
class Fibonacci
 {
 	 public static void main(String[] args)
 	{
		  int first_term,second_term,next_term;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first term:");
		first_term=sc.nextInt();
		System.out.println("Enter a second term:");
		second_term=sc.nextInt();


   		 for (int i = 1; i <= 10; i++)
 {
		 next_term = first_term + second_term;
    		 first_term = second_term;
     		 second_term = next_term;
  
    	         System.out.print(next_term + ", ");

    }
  }
}