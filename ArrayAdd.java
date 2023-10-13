//WAP to accept 5 inputs for two arrays and add them.
import java.util.Scanner;
public class ArrayAdd
{
	public static void main(String[]args)
	{
		int i;
		int[] a=new int[5];
		int[] b=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first five values");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second five values");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The addition of both arrays:");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]+b[i]);
		}
	}
}