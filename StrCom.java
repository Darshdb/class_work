import java.util.Scanner;
public class StrCom
{
	public static void main(String[]args)
	{
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings");
		str1=sc.nextLine();
		str2=sc.nextLine();
		int i=str1.compareTo(str2); //it returns value 0 if both the strings are equal.
		if(i==0)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
}