/*WAP to accept customer details as name ,flatno,parking (yes/no),if yes then allocate parking with flat number and display all customers details*/

import java.util.Scanner;

class Customer {
    String name;
    String flatNo;
    boolean parking;

    public Customer(String name, String flatNo, boolean parking) {
        this.name = name;
        this.flatNo = flatNo;
        this.parking = parking;
    }
}

public class CustomerManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Customer[] customers = new Customer[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Customer " + (i + 1) + " details:");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Flat No: ");
            String flatNo = scanner.nextLine();
            
            System.out.print("Parking Required (yes/no): ");
            String parkingChoice = scanner.nextLine();
            boolean parking = parkingChoice.equalsIgnoreCase("yes");
            
            customers[i] = new Customer(name, flatNo, parking);
            
            if (parking) {
                System.out.println("Parking allocated for Flat No " + flatNo);
            }
        }

        System.out.println("\nCustomer Details:");
        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Customer " + (i + 1) + " - Name: " + customers[i].name +
                    ", Flat No: " + customers[i].flatNo +
                    ", Parking: " + (customers[i].parking ? "Allocated" : "Not Allocated"));
        }
    }
}
