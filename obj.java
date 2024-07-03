import java.util.Scanner;

public class obj {
    // Define a class called 'Car'
static class Car {
    // Instance variables (or fields)
    String make;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

// Main class to demonstrate the use of Car class

    public static void main(String[] args) {
        // Creating objects of class Car
        Car car1 = new Car("Toyota", "Mark X", 2020);
        Car car2 = new Car("Honda", "Insight", 2023);

        // Calling method to display information about car1
        System.out.println("Information about Car 1:");
        car1.displayInfo();

        // Calling method to display information about car2
        System.out.println("\nInformation about Car 2:");
        car2.displayInfo();
    }


}
