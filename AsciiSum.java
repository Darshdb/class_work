//WAP to accept a set of any 10 characters. Calculate and print the sum of ASCII codes of the characters

import java.util.*;

public class AsciiSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 characters:");
		String input=sc.nextLine();
		char [ ] charArr = input.toCharArray();
		int sum=0;
		
		for(int i=0;i<charArr.length;i++)
		{	
			sum+=(int)(charArr[i]);
		}
		System.out.println("The sum of given character ascii value is:"+sum);
}
}




		