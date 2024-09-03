import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Address: ");
        String studentAddress = sc.nextLine();
        System.out.print("Phone Number: ");
        String studentPhoneNumber = sc.nextLine();
        System.out.print("Email Address: ");
        String studentEmailAddress = sc.nextLine();
        System.out.print("Enrollment Course: ");
        String enrollmentCourse = sc.nextLine();

        Student student = new Student(studentName, studentAddress, studentPhoneNumber, studentEmailAddress,
                enrollmentCourse);

        System.out.println("\nEnter employee details:");
        System.out.print("Name: ");
        String employeeName = sc.nextLine();
        System.out.print("Address: ");
        String employeeAddress = sc.nextLine();
        System.out.print("Phone Number: ");
        String employeePhoneNumber = sc.nextLine();
        System.out.print("Email Address: ");
        String employeeEmailAddress = sc.nextLine();
        System.out.print("Office: ");
        String office = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline character
        System.out.print("Designation: ");
        String designation = sc.nextLine();

        Employee emp = new Employee(employeeName, employeeAddress, employeePhoneNumber, employeeEmailAddress, office,
                salary, designation);

        System.out.println("Student INFORMATION:::");
        student.display();
        System.out.println("Employee INFORMATION:::");
        emp.display();
        sc.close();
    }
}

abstract class Person {
    String name, address, phoneNumber, emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

class Student extends Person {
    String enrollmentCourse;

    Student(String name, String address, String phoneNumber, String emailAddress, String enrollmentCourse) {
        super(name, address, phoneNumber, emailAddress);
        this.enrollmentCourse = enrollmentCourse;
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Enrollment Course: " + enrollmentCourse);
    }

}

class Employee extends Person {
    String office, designation;
    double salary;

    Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String designation) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}