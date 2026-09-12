import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {

    private LocalDate journeyDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    // Constructor
    public Schedule(
            LocalDate journeyDate,
            LocalTime departureTime,
            LocalTime arrivalTime) {

        this.journeyDate = journeyDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getters
    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    // Setters
    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Date: " + journeyDate
                + " | Departure: " + departureTime
                + " | Arrival: " + arrivalTime;
    }
}