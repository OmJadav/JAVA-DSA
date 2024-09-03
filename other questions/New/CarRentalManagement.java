// You are required to create a car rental management system in Java using the following features:
// 1. Car (class) : This class should have the following properties:
// 	make (String) — the name of the car company
// 	model (String) — the name car model
// 	year (int), color (String), rented (Boolean).
// 	This class should have following methods:
// Car constructor with argument that initializes the properties of class using this
// keyword.
// 	isRented() — method that returns rented
// 	setRented() — method with argument that set rented
// 	showCar() — method to display car details
// the Car class will have two child classes: EconomyCar and LuxuryCar.

// EconomyCar has
// 	Final instance variable price of type double.
// 	The parametrized constructor (String make, String model, int year, String color,
// 		double price) that initializes the properties of the class using the constructor of the
// 		parent class (Car) and initialize price.
// 	overridden showCar() to call parent showCar() method and display price.

// LuxuryCar has
// 	Final instance variable speed _ limit of type int
// 	the parametrized constructor (String make, String model, int year, String color,
// 		int speed_limit) that initializes the properties of the class using the constructor of the
// 		parent class (Car) and initialize speed _ limit
// 	overridden showCar() to call parent showCar() method and display speed_limit.

// 2. Customer: This class should have the following properties:
// 	Name (String) , address (String), phone (String), email (String), rentedCar (Car).
// 	This class Should have following methods:
// 		Customer constructor with argument that initializes the properties of class using
// 		this keyword
// 		getRentedCar() — method that returns rentedCar (Object of Car
// 		setRentedCar() — method with argument rentCar as object of type Car. That set
// 		rentedCar if rentCar is not rented, Otherwise show message "car already rented".
// 		returnCar() — method with no return ,to set rentedCar's rented property as false
// 			and then set to null.
// 		showCustomer() — shows details of customer. If customer rented any car, show
// 			details of class as well using showCar(), otherwise show "NO car rented".

// 3. Main:(class) 
// 	This class will contain the main method and will create an object of the above
// 		classes to start the car rental management system and perform following tasks.
// 	Create one object of economy car and one luxury car.
// 	Create array of object of Customer class of size 3
// 	Rent economy car to customer O, luxury car to customer 1
// 	show details of.all 3 customers
// 	rent economy car to customer 2 (must show message "already rented")
// 	return car of cutomer O
// 	rent returned car to cutomer 3
// 	show details of all 3 customers again

public class CarRentalManagement {
    public static void main(String[] args) {
        EconomyCar economyCar = new EconomyCar("Toyota", "Corolla", 2022, "Black", 100.0);
        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X5", 2023, "Silver", 180);
        Customer[] customers = new Customer[3];
            customers[0] = new Customer("Customer 1", "Address 1", "123456789", "customer1@example.com");
            customers[1] = new Customer("Customer 2", "Address 2", "987654321", "customer2@example.com");
            customers[2] = new Customer("Customer 3", "Address 3", "567890123", "customer3@example.com");
            customers[0].setRentedCar(economyCar);
            customers[1].setRentedCar(luxuryCar);

            for (Customer customer : customers) {
                customer.showCustomer();
                System.out.println();
            }
            System.out.println("Trying to rent economy car to customer 2:");
            customers[2].setRentedCar(economyCar); // Should show "Car already rented" message
    
            System.out.println("\nReturning car of customer 1:");
            customers[0].returnCar();
    
            System.out.println("\nRenting returned car to customer 3:");
            customers[2].setRentedCar(economyCar);
    
            System.out.println("\nDetails after renting returned car:");
            for (Customer customer : customers) {
                customer.showCustomer();
                System.out.println();
            }
        }
}

class Car{
    String make;
    String model;
    int year;
    String color;
    boolean rented;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.rented = false;
    }
    boolean isRented() {
        return rented;
    }
    void setRented(boolean rented) {
        this.rented = rented;
    }
    void showCar() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Rented: " + rented);
    }
}


class EconomyCar extends Car {
    final double price;
    EconomyCar(String make, String model, int year, String color, double price) {
        super(make, model, year, color);
        this.price = price;
    }
    void showCar() {
        super.showCar();
        System.out.println("Price: " + price);
    }
}

class LuxuryCar extends Car {
    final int speedLimit;

    LuxuryCar(String make, String model, int year, String color, int speedLimit) {
        super(make, model, year, color);
        this.speedLimit = speedLimit;
    }

    void showCar() {
        super.showCar();
        System.out.println("Speed Limit: " + speedLimit);
    }
}

class Customer{
    String name;
    String address;
    String phone;
    String email;
    Car rentedCar;

    Customer(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    Car getRentedCar() {
        return rentedCar;
    }
    void setRentedCar(Car rentCar) {
        if(!rentCar.isRented()){
            this.rentedCar=rentCar;
            rentCar.setRented(true);
        }else{
            System.out.println("Car already rented.");
        }
    }
    void returnCar() {
        if (rentedCar != null) {
            rentedCar.setRented(false);
            rentedCar = null;
        }
    }
    void showCustomer() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            if (rentedCar != null) {
                System.out.println("Rented Car Details:");
                rentedCar.showCar();
            } else {
                System.out.println("No car rented.");
            }
        }
}