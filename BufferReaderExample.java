//WAP to accept customer name and apply validation that name can not be empty
length()

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name:");
        String name = br.readLine(); // Use readLine() to read the whole line
        if (name.length() == 0) {
            System.out.println("Please enter a name:");
        } else {
            System.out.println("Welcome" + " " + name);
        }
    }
}
