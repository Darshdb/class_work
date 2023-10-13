import java.util.Scanner;
public class ArrayDemo
{
	public static void main(String[]args)
	{
		int i;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five values");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("You have entered:");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}