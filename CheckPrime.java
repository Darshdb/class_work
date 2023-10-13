//Q.1)Check whether the user input number is prime number or not

import java.util.Scanner;							//import the scanner class from util package

class PrimeNumberCheck{							//base class started
    public boolean isPrimeNumber(int number) {			
        if (number <= 1) {							//check condition
            return false;								//while condition is true it returns value as false
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {			//for loop started and added the pre defined math square root function
            if (number % i == 0) {						//if condition checking
                return false;							//if it is true then it returns false value
            }
        }

        return true;								//if both are conditions are false then returns a true value which is boolean type
    }
}

public class CheckPrime{							//main class started
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);		//scanner method object created
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        PrimeNumberCheck pc = new PrimeNumberCheck();   //base class object is created
        boolean isPrime = pc.isPrimeNumber(number);		  //object return value store in variable

        if (isPrime) {								 //if boolean value is true then print if part other wise else part
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
