import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class ElectricityBill {
    double amount = 50;
    Scanner sc = new Scanner(System.in);
    String customerName = "";
    String billType = "";

    double calculateBillResidential(double unitsConsumed) {
        if (unitsConsumed <= 50) {
            return unitsConsumed * 3;
        } else if (unitsConsumed <= 100) {
            return (50 * 3) + (unitsConsumed - 50) * 3.5;
        } else if (unitsConsumed <= 250) {
            return (50 * 3) + (100 * 3.5) + (unitsConsumed - 150) * 4.5;
        } else {
            return (50 * 3) + (100 * 3.5) + (250 * 4.5) + (unitsConsumed - 400) * 5;
        }
    }

    double calculateBillCommercial(double unitsConsumed) {
        if (unitsConsumed <= 50) {
            return unitsConsumed * 2.5;
        } else if (unitsConsumed <= 100) {
            return (50 * 2.5) + (unitsConsumed - 50) * 3.5;
        } else if (unitsConsumed <= 250) {
            return (50 * 2.5) + (100 * 3.5) + (unitsConsumed - 150) * 4;
        } else {
            return (50 * 2.5) + (100 * 3.5) + (250 * 4) + (unitsConsumed - 400) * 5;
        }
    }

    double calculateBillRural(double unitsConsumed) {
        if (unitsConsumed <= 50) {
            return unitsConsumed * 1.5;
        } else if (unitsConsumed <= 100) {
            return (50 * 1.5) + (unitsConsumed - 50) * 3;
        } else if (unitsConsumed <= 250) {
            return (50 * 1.5) + (100 * 3) + (unitsConsumed - 150) * 3.5;
        } else {
            return (50 * 1.5) + (100 * 3) + (250 * 3.5) + (unitsConsumed - 400) * 4.5;
        }
    }

    double calculateBillEducational(double unitsConsumed) {
        return (unitsConsumed * 4.5) + 50;
    }

    void displayBill(String cName, double units, double amount, int charges, String type) {
        this.amount = amount + charges; // Save total bill amount for payment feature
        this.customerName = cName;
        this.billType = type;
        System.out.println();
        System.out.println("=============E-BILL=============");
        System.out.println("Customer Name : " + cName);
        System.out.println("Type of bill : " + type);
        System.out.println("Units used : " + units);
        System.out.println("Fix charges : " + charges);
        System.out.println("Net payable amount : " + this.amount);
        System.out.println("================================");
        System.out.println();

        System.out.println("Your electricity bill for " + units + " units is " + (amount + charges) + " rupees");
    }

    void compare() {
        int ch;

        System.out.println("Choose a month to compare with your current bill");
        System.out.println(
                " 1.JANUARY \n 2.FEBRUARY \n 3.MARCH \n 4.APRIL \n 5.MAY \n 6.JUNE \n 7.JULY \n 8.AUGUST \n 9.SEPTEMBER \n 10.OCTOBER \n 11.NOVEMBER \n 12.DECEMBER");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                compareWithPreviousBill(amount, 900, "January");
                break;
            case 2:
                compareWithPreviousBill(amount, 750, "February");
                break;
            case 3:
                compareWithPreviousBill(amount, 2500, "March");
                break;
            case 4:
                compareWithPreviousBill(amount, 2800, "April");
                break;
            case 5:
                compareWithPreviousBill(amount, 3100, "May");
                break;
            case 6:
                compareWithPreviousBill(amount, 2900, "June");
                break;
            case 7:
                compareWithPreviousBill(amount, 2700, "July");
                break;
            case 8:
                compareWithPreviousBill(amount, 2500, "August");
                break;
            case 9:
                compareWithPreviousBill(amount, 2200, "September");
                break;
            case 10:
                compareWithPreviousBill(amount, 1800, "October");
                break;
            case 11:
                compareWithPreviousBill(amount, 1500, "November");
                break;
            case 12:
                compareWithPreviousBill(amount, 1000, "December");
                break;
            default:
                System.out.println("Invalid month selection.");
                break;
        }
    }

    void compareWithPreviousBill(double currentBillAmount, double previousBillAmount, String month) {
        if (currentBillAmount > previousBillAmount) {
            System.out.println("Your current bill is increased by " + (currentBillAmount - previousBillAmount)
                    + " rupees compared to the previous " + month + " bill.");
        } else if (currentBillAmount < previousBillAmount) {
            System.out.println("Your current bill is decreased by " + (previousBillAmount - currentBillAmount)
                    + " rupees compared to the previous " + month + " bill.");
        } else {
            System.out.println("Your current bill is the same as the previous " + month + " bill.");
        }
    }

    void generateBillTextFile(String userName, String billType, double amount) {
        LocalDateTime dateTime = LocalDateTime.now();
        String formatter = dateTime.toString();
        String formatterSplit[] = formatter.split("T");
        String[] dateSplit = formatterSplit[0].split("-");
        String[] timeSplit = formatterSplit[1].split(":");
        String fileName = userName + "" + billType + "" + timeSplit[2] + ".txt";

        // System.out.println(dateTime);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("----------------------------------------------------\n");
            writer.write("--------------Gujarat Electricity Board-------------\n");
            writer.write("----------------------------------------------------\n");
            writer.newLine();
            writer.write("---E-bill---\n");
            writer.newLine();
            writer.write("Date : " + dateSplit[2] + " - " + dateSplit[1] + " - " + dateSplit[0] + "\n");
            writer.newLine();
            writer.write("Customer Name: " + this.customerName + "\n");
            writer.newLine();
            writer.write("Bill Type: " + this.billType + "\n");
            writer.newLine();
            writer.write("Amount: " + this.amount + " rupees\n");
            System.out.println("Bill text file generated successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the bill text file: " + e.getMessage());
        }
    }

    void generateBillReceipt(String userName, String billType, double amount) {
        String fileName = userName + "_" + billType + "_Receipt" + ".txt";
        LocalDate dateTime = LocalDateTime.now().toLocalDate();
        String formatter = dateTime.toString();
        String dateSplit[] = formatter.split("-");

        System.out.println(dateTime);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("----------------------------------------------------\n");
            writer.write("--------------Gujarat Electricity Board-------------\n");
            writer.write("----------------------------------------------------\n");
            writer.newLine();
            writer.write("--- E-receipt ---\n");
            writer.newLine();
            writer.write("Customer Name: " + this.customerName + "\n");
            writer.newLine();
            writer.write("Bill Paid on Date : " + dateSplit[2] + " - " + dateSplit[1] + " - " + dateSplit[0] + "\n");
            writer.newLine();
            writer.write("Bill Type: " + this.billType + "\n");
            writer.newLine();
            writer.write("Amount: " + this.amount + " rupees\n");
            writer.write("Payment Done. Thank You for your payment.\n");
            System.out.println("Bill Receipt file generated successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the bill text file: " + e.getMessage());
        }
    }

    void wantCompare() {
        System.out.println("Do you want to compare your bill with previous bills ? \n 1.Yes \n 2.No");
        int c = sc.nextInt();
        if (c == 1) {
            compare();
        }
    }

    void payBill() {
        if (this.amount > 0) {
            System.out.println("Your bill amount is: " + this.amount + " rupees.");
            System.out.println("Proceeding to payment...");
            System.out.println("Payment successful. Thank you for paying your electricity bill.");
            generateBillReceipt(customerName, billType, amount);
            this.amount = 0; // Reset the bill amount after payment
        } else {
            System.out.println("No outstanding bill to pay.");
        }
    }
}

class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBill e = new ElectricityBill();

        int choice;
        do {
            System.out.println();
            System.out.println("Electricity Bill Generator");
            System.out.println();
            System.out.println("-> Choose your bill type");
            System.out.println("1. Residential bill");
            System.out.println("2. Commercial bill");
            System.out.println("3. Rural bill");
            System.out.println("4. Educational institute bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your Name : ");
                    String cNameRes = sc.next();
                    sc.nextLine();
                    System.out.print("Enter consumed Units : ");
                    double unitsRes = sc.nextDouble();
                    double resBillAmount = e.calculateBillResidential(unitsRes);
                    e.displayBill(cNameRes, unitsRes, resBillAmount, 15, "Residential");
                    e.generateBillTextFile(cNameRes, "Residential", resBillAmount);
                    e.wantCompare();
                    e.payBill();
                    break;

                case 2:
                    System.out.print("Enter your Name : ");
                    String cNameComm = sc.next();
                    sc.nextLine();
                    System.out.print("Enter consumed Units : ");
                    double unitsComm = sc.nextDouble();
                    double commBillAmount = e.calculateBillCommercial(unitsComm);
                    e.displayBill(cNameComm, unitsComm, commBillAmount, 25, "Commercial");
                    e.generateBillTextFile(cNameComm, "Commercial", commBillAmount);
                    e.wantCompare();
                    e.payBill();
                    break;

                case 3:
                    System.out.print("Enter your Name : ");
                    String cNameRural = sc.next();
                    sc.nextLine();
                    System.out.print("Enter consumed Units : ");
                    double unitsRural = sc.nextDouble();
                    double ruralBillAmount = e.calculateBillRural(unitsRural);
                    e.displayBill(cNameRural, unitsRural, ruralBillAmount, 5, "Rural");
                    e.generateBillTextFile(cNameRural, "Rural", ruralBillAmount);
                    e.wantCompare();
                    e.payBill();

                    break;

                case 4:
                    System.out.print("Enter your Name : ");
                    String cNameEdu = sc.next();
                    sc.nextLine();
                    System.out.print("Enter consumed Units : ");
                    double unitsEdu = sc.nextDouble();
                    double eduBillAmount = e.calculateBillEducational(unitsEdu);
                    e.displayBill(cNameEdu, unitsEdu, eduBillAmount, 0, "Educational institute");
                    e.generateBillTextFile(cNameEdu, "Educational", eduBillAmount);
                    e.wantCompare();
                    e.payBill();
                    break;

                case 5:
                    System.out.println("Thanks for using the Electricity Billing System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}