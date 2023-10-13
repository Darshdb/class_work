/*If the first string is lexicographycally greater than the second string,it returns a positive number (difference of character value).
If the first string is less than the second string lexicographically, it returns a negative number, and,
If the first string is lexicographically equal to the second string it returns 0.
*/
import java.util.Scanner;
public class StrCom1
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
		String str1;
		String str2;
		System.out.println("Enter a two strings:");
		str1=sc.nextLine();
		str2=sc.nextLine();
		int i=str1.compareTo(str2);
		System.out.println("If the both strings is equal then print 1 other wise 2:"+i);
		System.out.println("String 1 in lower case:"+str1.toLowerCase());
		System.out.println("String 2 in Upper case:"+str2.toUpperCase());
		System.out.println("String 1 length is:"+str1.length());
		System.out.println("String 2 length is:"+str2.length());
		System.out.println("String 1 second character is:"+str1.charAt(2));
		System.out.println("String 2 second character is:"+str2.charAt(2));

}
}