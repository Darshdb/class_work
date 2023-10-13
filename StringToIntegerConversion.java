/*Write  a Java program that reads a string input from the user. Convert the string to an integer using the Integer.parseInt() method. Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. Display a message indicating that the input is not a valid integer.*/

import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Successfully converted to integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.");
        }
    }
}
