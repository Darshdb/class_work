/*Question 2: Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods. Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle*/

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    
    void start() {
        System.out.println("Car is starting...");
    }

    
    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Motorcycle extends Vehicle {
    
    void start() {
        System.out.println("Motorcycle is starting...");
    }

   
    void stop() {
        System.out.println("Motorcycle is stopping...");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car();
        Motorcycle m = new Motorcycle();

        System.out.println("Starting and stopping operations for a car:");
        c.start();
        c.stop();

        System.out.println("\nStarting and stopping operations for a motorcycle:");
        m.start();
        m.stop();
    }
}
