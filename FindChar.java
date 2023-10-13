//WAP to input set of N  characters. Find and display the number of uppercase and lowercase charachers.Assume that none of the character is digit or a special character

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a set of characters: ");
        String input = scanner.nextLine();

        int uppercase = 0;
        int lowercase= 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c))
		 {
                uppercase++;
        	    } 
		else if (Character.isLowerCase(c)) 
		{
                lowercase++;
            }
        }

        System.out.println("Number of uppercase characters: " + uppercase);
        System.out.println("Number of lowercase characters: " + lowercase);
    }
}






