//Q32-WAP to accept Character from user and make a decision whether is vowel or consonent.

import java.util.*;

class Vowel
{
	public static void main(String[]args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a alphabet:");
		ch=sc.next().charAt(0);
		
		
	switch(ch)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':			
		case 'u':	
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':	
				System.out.println(ch+ " Character is vowel");	
		break;
		default:
				System.out.println(ch+ " Character is not vowel");	
				
}
}
}