//Q.2)WAP to generate prime numbers between 1 and 100

class PrimeCheck {													//base class started
    public void generatePrimes(int start, int end) {								//create function for perform operations
        System.out.println("Prime numbers between " + start + " and " + end + ":");		//print start point and end point
        for (int i = start; i <= end; i++) {										//for loop initialise , check condition, increament
            if (isPrimeNumber(i)) {											//check if condition
                System.out.print(i + " ");										//print i with post increament
            }
        }
        System.out.println();												//print for next line
    }

    private boolean isPrimeNumber(int number) {								//boolean function with integer parameter
        if (number <= 1) {												//if condition checking
            return false;													//if condition is true then it returns false value
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {								//for loop started with pre defined  math square root method
            if (number % i == 0) {											//if condition checking
                return false;												//if condition is true then it returns false value
            }
        }

        return true;													//if conditions is false then it returns true value
    }
}

public class PrimeGenerator {											//main class created
    public static void main(String[] args) {									//main method started
        PrimeCheck pg = new PrimeCheck();									//base class object created
        pg.generatePrimes(1, 100);										//base class function called through it's class object
    }
}
