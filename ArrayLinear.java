import java.util.Scanner;
public class ArrayLinear
{
	public static void main(String[]args)
	{
		int count,num,i;
		int[]array=new int[10];
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 10 numbers of elements in array:");
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to search:");
		num=sc.nextInt();
		
		//compare each element of array with num
		for(i=0;i<10;i++)
		{
			if(num==array[i])
			{		
				System.out.println(num+" is present at index"+i);
				break;
			}
		}
		if(i==0)
		{	
			System.out.println(num+" not present in input"+i);
		}
}
}