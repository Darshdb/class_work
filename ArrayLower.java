//Wap to accept five values from user and find minimum value from them.

import java.util.Scanner;
public class ArrayLower
{
	public static void main(String[]args)
	{
		int i,j;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five values");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The smallest number:");
		j=a[0];
		for(i=1;i<5;i++)
		{
			if(j>a[i])
			{
				j=a[i];
			}
		}
		System.out.println(j);
	}
}