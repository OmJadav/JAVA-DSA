//Write a program in java  that implementts dynamic method dispatch.

public class Que2 {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        // Calling the sound method
        animal1.sound(); // Dynamic method dispatch
        animal2.sound(); // Dynamic method dispatch
    } 
}

// Parent class
class Animal {
    // Method to make a sound
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method of parent class
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    // Overriding the sound method of parent class
    void sound() {
        System.out.println("Cat meows");
    }
}