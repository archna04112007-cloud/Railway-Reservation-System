import java.time.LocalDate;
import java.time.LocalTime;

public class PlatformAllocation {

    private String allocationId;
    private Train train;
    private Platform platform;
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private LocalDate date;

    public PlatformAllocation(
            String allocationId,
            Train train,
            Platform platform,
            LocalTime arrivalTime,
            LocalTime departureTime,
            LocalDate date) {

        this.allocationId = allocationId;
        this.train = train;
        this.platform = platform;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.date = date;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public Train getTrain() {
        return train;
    }

    public Platform getPlatform() {
        return platform;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public boolean isTimeOverlap(
            LocalTime incomingArrival,
            LocalTime incomingDeparture) {

        return incomingArrival.isBefore(this.departureTime)
                && incomingDeparture.isAfter(this.arrivalTime);
    }

    @Override
    public String toString() {
        return "Allocation ID: " + allocationId
                + " | Train: " + train.getTrainNumber()
                + " | Platform: " + platform.getPlatformId()
                + " | Arrival: " + arrivalTime
                + " | Departure: " + departureTime
                + " | Date: " + date;
    }
}
