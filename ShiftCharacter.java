/*
 * This program takes a user-defined input and performs character shifting based on the following rules:
 * 1. All Upper Case letters are shifted left by 2 characters.
 * 2. All Lower Case letters are shifted left by 3 characters.
 */

import java.util.Scanner;

public class ShiftCharacter {
	public static void main(String[] args) {
		
		//Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		
		//taking input
		String str = sc.next();
		String ans = "";
		
		//for loop
		for (int i = 0; i < str.length(); i++) {

			//checking if char is uppercase then shift it by 2 
			// if char is A or B it should be Y and Z respectively 
			if (Character.isUpperCase(str.charAt(i))) {
				if (str.charAt(i) == 'A') {
					ans += 'Y';
				} else if (str.charAt(i) == 'B') {
					ans += 'Z';
				} else {
					ans += (char) (str.charAt(i) - 2);
				}

				
			}
			//checking if char is lowercase then shift it by 3
			// if char is a or b or c it should be x , y and z respectively 
			
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ans += (char) ('a' + (str.charAt(i) - 'a'+23)%26);
			}
		}
		System.out.println("Answer : " + ans);
		
	}
}