import java.util.ArrayList;
import java.util.List;

public class ReservationManager {

    private List<Passenger> passengers;
    private List<Reservation> reservations;

    public ReservationManager() {
        passengers = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void registerPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger registered successfully!");
    }

    public Reservation makeReservation(
            Passenger passenger,
            String trainName,
            String trainNumber,
            String source,
            String destination,
            String journeyDate,
            String seatNumber,
            double fare) {

        Reservation reservation = new Reservation(
                passenger,
                trainName,
                trainNumber,
                source,
                destination,
                journeyDate,
                seatNumber,
                fare
        );

        reservations.add(reservation);

        System.out.println("Reservation successful!");
        System.out.println("PNR: " + reservation.getPnr());

        return reservation;
    }

    public Reservation searchByPNR(String pnr) {

        for (Reservation reservation : reservations) {

            if (reservation.getPnr().equalsIgnoreCase(pnr)) {
                return reservation;
            }
        }

        return null;
    }

    public void displayAllReservations() {

        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        for (Reservation reservation : reservations) {
            reservation.displayReservation();
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getReservationCount() {
        return reservations.size();
    }
}
