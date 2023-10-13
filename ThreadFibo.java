/*Q.1)Write a JAVA program which will generate the threads:

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/

public class ThreadFibo {
    public static void main(String[] args) {
      																	  // Creating and starting Fibonacci thread
        FibonacciThread fibonacciThread = new FibonacciThread();							
        fibonacciThread.start();													
        
    																	    // Creating and starting Reverse Count thread
        ReverseCountThread reverseCountThread = new ReverseCountThread();				
        reverseCountThread.start();												
       																	 //using class object thread is started
        
    }
}

class FibonacciThread extends Thread {											//fibonacci thread is created
    @Override
    public void run() {															//run method is created
        int n = 10;																//variable initialization
        System.out.println("Fibonacci Series (First " + n + " terms):");						//prints the number series
        
        int first = 0, second = 1;													
        System.out.print(first + " " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;												//using for loop print the series in forward 
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        
        System.out.println("\nFibonacci thread finished.");								//fibonacci series thread is finished
    }
}

class ReverseCountThread extends Thread {										
    @Override
    public void run() {
        System.out.println("Countdown from 10 to 1 in reverse:");
        
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");													//using for loop print the series in reverse form

        }
        
        System.out.println("\nReverse count thread finished.");							//reverse thread is finished
    }
}
