/*Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil"
*/

import java.util.Scanner;

public class CharacterShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String shiftedString = shiftCharacters(input);
        System.out.println("Shifted string: " + shiftedString);
    }

    public static String shiftCharacters(String input) {
        StringBuilder shiftedString = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char shiftedChar = (char) ((c - 'A' - 2 + 26) % 26 + 'A');
                shiftedString.append(shiftedChar);
            } else if (Character.isLowerCase(c)) {
                char shiftedChar = (char) ((c - 'a' - 3 + 26) % 26 + 'a');
                shiftedString.append(shiftedChar);
            } else {
                shiftedString.append(c);
            }
        }

        return shiftedString.toString();
    }
}