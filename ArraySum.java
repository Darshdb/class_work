//WAp to get sum of an array accept 7 elments from user

import java.util.Scanner;
public class ArraySum
{
	public static void main(String[]args)
	{
		int i;
		int[] a=new int[7];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 7 values");
		for(i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The sum of arrays:");
		for(i=0;i<7;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println("The average of arrays:"+(sum/7));
	}
}

