import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReservationManager manager = new ReservationManager();

        System.out.println("====================================");
        System.out.println("       SMART RAILWAY SYSTEM");
        System.out.println("====================================");


        System.out.println("\n--- Passenger Registration ---");

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter passenger ID: ");
        String passengerId = sc.nextLine();

        System.out.print("Enter ID proof: ");
        String idProof = sc.nextLine();

        Passenger passenger = new Passenger(
                name,
                age,
                gender,
                phone,
                email,
                passengerId,
                idProof
        );

        manager.registerPassenger(passenger);

    
        System.out.println("\n--- Train Details ---");

        System.out.print("Enter train name: ");
        String trainName = sc.nextLine();

        System.out.print("Enter train number: ");
        String trainNumber = sc.nextLine();

        System.out.print("Enter source station: ");
        String source = sc.nextLine();

        System.out.print("Enter destination station: ");
        String destination = sc.nextLine();

        System.out.print("Enter journey date: ");
        String journeyDate = sc.nextLine();

        
        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter fare: ");
        double fare = sc.nextDouble();

        
        System.out.println("\n--- Making Reservation ---");

        Reservation reservation = manager.makeReservation(
                passenger,
                trainName,
                trainNumber,
                source,
                destination,
                journeyDate,
                seatNumber,
                fare
        );

        
        System.out.println("\n--- Reservation Details ---");
        reservation.displayReservation();

        
        Ticket ticket = new Ticket(reservation);

        System.out.println("\n--- Ticket Generated ---");
        ticket.displayTicket();

        sc.close();
    }
}
