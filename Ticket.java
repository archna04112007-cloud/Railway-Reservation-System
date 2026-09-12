public class Ticket {

    private String ticketId;
    private Reservation reservation;

    public Ticket(Reservation reservation) {
        this.reservation = reservation;
        this.ticketId = "TKT" + reservation.getPnr();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void displayTicket() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("             SMART RAIL");
        System.out.println("             TRAIN TICKET");
        System.out.println("========================================");
        System.out.println("Ticket ID     : " + ticketId);
        System.out.println("PNR           : " + reservation.getPnr());
        System.out.println("Passenger     : "
                + reservation.getPassenger().getName());
        System.out.println("Age           : "
                + reservation.getPassenger().getAge());
        System.out.println("Train         : "
                + reservation.getTrainName());
        System.out.println("Train Number  : "
                + reservation.getTrainNumber());
        System.out.println("From          : "
                + reservation.getSource());
        System.out.println("To            : "
                + reservation.getDestination());
        System.out.println("Journey Date  : "
                + reservation.getJourneyDate());
        System.out.println("Seat Number   : "
                + reservation.getSeatNumber());
        System.out.println("Fare          : Rs. "
                + reservation.getFare());
        System.out.println("Status        : "
                + reservation.getStatus());
        System.out.println("========================================");
    }
}
