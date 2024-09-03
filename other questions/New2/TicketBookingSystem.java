import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBookingImpl tbi = new TicketBookingImpl();
        boolean a = true;

        while (a) {
            System.out.println("1. Book ticket");
            System.out.println("2. Display Ticket ");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        tbi.bookTicket();
                        break;
                    case 2:
                        tbi.displayTicket();
                        break;
                    case 3:
                        System.out.println("Thank you for using the system!");
                        return;
                    default:
                        System.out.println("Enter valid choice .");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);

            }
            tbi.displayTicket();

        }

    }
}

abstract class Ticket {
    public String ticketId;
    public String passengerName;
    public double ticketPrice;

    Scanner sc = new Scanner(System.in);

    Ticket() {
        System.out.println("Enter your ticket id : ");
        this.ticketId = sc.next();
        System.out.println("Enter your name : ");
        sc.nextLine();
        this.passengerName = sc.nextLine();
        System.out.println("Enter ticket price : ");
        this.ticketPrice = sc.nextDouble();
    }

    abstract void displayTicketDetails();
}

class flightTicket extends Ticket {
    Scanner sc = new Scanner(System.in);
    public String flightNumber;
    public String airlineName;
    public String departureAirport;
    public String destinationAirport;

    flightTicket() {
        super();
        System.out.println("Enter your flight number: ");
        this.flightNumber = sc.next();
        System.out.println("Enter your airline name : ");
        this.airlineName = sc.next();
        System.out.println("Enter your departure airport : ");
        this.departureAirport = sc.next();
        System.out.println("Enter your destination airport : ");
        this.destinationAirport = sc.next();

    }

    public void displayTicketDetails() {
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Airline name  : " + airlineName);
        System.out.println("departure airport : " + departureAirport);
        System.out.println("destination airport : " + destinationAirport);
        System.out.println("ticket id  : " + ticketId);
        System.out.println("passenger name  : " + passengerName);
        System.out.println("ticket price : " + ticketPrice);

    }
}

class trainTicket extends Ticket {
    Scanner sc = new Scanner(System.in);
    public String trainNumber;
    public int seatNumber;
    public String departureStation;
    public String destinationStation;

    trainTicket() {
        super();
        System.out.println("Enter your train number : ");
        this.trainNumber = sc.next();
        System.out.println("Enter your departure airport : ");
        this.departureStation = sc.next();
        System.out.println("Enter your destination airport : ");
        this.destinationStation = sc.next();
        System.out.println("Enter your seat number : ");
        this.seatNumber = sc.nextInt();
    }

    public void displayTicketDetails() {
        System.out.println("Flight Number : " + trainNumber);
        System.out.println("Train seat number  : " + seatNumber);
        System.out.println("departure train Station : " + departureStation);
        System.out.println("destination train Station : " + destinationStation);
        System.out.println("ticket id  : " + ticketId);
        System.out.println("passenger name  : " + passengerName);
        System.out.println("ticket price : " + ticketPrice);
    }
}

interface TicketBooking {
    void bookTicket();

    void displayTicket();
}

class TicketNotFoundException extends Exception {
    TicketNotFoundException() {
        super("Ticket is Not Found");
    }
}

class MaxTicketsReachedException extends Exception {
    MaxTicketsReachedException() {
        super("Maximum Number of Ticket has been reached");
    }
}

class TicketBookingImpl implements TicketBooking {
    Scanner sc = new Scanner(System.in);

    public Ticket[] tickets;
    public int ticketCount;

    TicketBookingImpl() {
        tickets = new Ticket[2];
        ticketCount = 0;
        ticketCount++;
    }

    public void bookTicket() {
        System.out.println("Enter the ticket type \n1.Flight\n2.Train\nEnter your choice : ");
        int choice = sc.nextInt();

        if (ticketCount >= tickets.length) {
            try {
                throw new MaxTicketsReachedException();
            } catch (MaxTicketsReachedException e) {
                e.printStackTrace();
            }
        }
        switch (choice) {
            case 1:
                flightTicket ft = new flightTicket();
                ft.displayTicketDetails();
                break;
            case 2:
                trainTicket tt = new trainTicket();
                tt.displayTicketDetails();
                break;
            default:
                System.out.println("Enter Valid Choice");
                break;
        }
    }

    public void displayTicket() {
        System.out.println("Enter your ticket id for track your tickets : ");
        String ticket_id = sc.next();
        boolean ticketFound = false;
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i] != null && tickets[i].ticketId.equals(ticket_id)) {
                tickets[i].displayTicketDetails();
                ticketFound = true;
                break;
            }
        }
        if (!ticketFound) {
            try {
                throw new TicketNotFoundException();
            } catch (TicketNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
