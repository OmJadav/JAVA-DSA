public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor with real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Constructor with a string representation "a+bi"
    public ComplexNumber(String complexString) {
        String[] parts = complexString.split("\\+");
        this.real = Double.parseDouble(parts[0]);
        this.imaginary = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // Instantiate objects using constructor overloading
        ComplexNumber complex1 = new ComplexNumber(3, 4);
        ComplexNumber complex2 = new ComplexNumber("5+6i");

        // Add two complex numbers
        ComplexNumber result = complex1.add(complex2);

        // Display the result
        System.out.println("Result of addition: " + result);
    }
}
