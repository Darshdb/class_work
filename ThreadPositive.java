import java.util.Scanner;

class CheckNumber extends Thread {
    private int number;

    @Override
    public void run() 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number which you want to check!!!");
	number=sc.nextInt();
        if (number > 0) 
	{
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

public class ThreadPositive 
{
    public static void main(String[] args)
 {
        CheckNumber cn = new CheckNumber();
        cn.start();
    }
}
