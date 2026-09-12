import java.util.UUID;

public class Reservation {

    private String pnr;
    private Passenger passenger;
    private String trainName;
    private String trainNumber;
    private String source;
    private String destination;
    private String journeyDate;
    private String seatNumber;
    private double fare;
    private String status;

    public Reservation(Passenger passenger,
                       String trainName,
                       String trainNumber,
                       String source,
                       String destination,
                       String journeyDate,
                       String seatNumber,
                       double fare) {

        this.pnr = generatePNR();
        this.passenger = passenger;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.seatNumber = seatNumber;
        this.fare = fare;
        this.status = "CONFIRMED";
    }

    private String generatePNR() {
        return "SR" + UUID.randomUUID()
                .toString()
                .substring(0, 8)
                .toUpperCase();
    }

    public String getPnr() {
        return pnr;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getFare() {
        return fare;
    }

    public String getStatus() {
        return status;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayReservation() {
        System.out.println("=================================");
        System.out.println("       SMART RAIL RESERVATION");
        System.out.println("=================================");
        System.out.println("PNR           : " + pnr);
        System.out.println("Passenger     : " + passenger.getName());
        System.out.println("Train         : " + trainName);
        System.out.println("Train Number  : " + trainNumber);
        System.out.println("From          : " + source);
        System.out.println("To            : " + destination);
        System.out.println("Journey Date  : " + journeyDate);
        System.out.println("Seat Number   : " + seatNumber);
        System.out.println("Fare          : Rs. " + fare);
        System.out.println("Status        : " + status);
        System.out.println("=================================");
    }
}
