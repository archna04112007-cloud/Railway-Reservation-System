public class Train {

    private int trainNumber;
    private String trainName;
    private String trainType;
    private Route route;
    private Schedule schedule;

    // Constructor
    public Train(
            int trainNumber,
            String trainName,
            String trainType,
            Route route,
            Schedule schedule) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainType = trainType;
        this.route = route;
        this.schedule = schedule;
    }

    // Getters
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public Route getRoute() {
        return route;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    // Setters
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    // Display train information
    public void displayTrainDetails() {

        System.out.println("----- Train Details -----");
        System.out.println("Train Number : " + trainNumber);
        System.out.println("Train Name   : " + trainName);
        System.out.println("Train Type   : " + trainType);
        System.out.println("Route        : " + route);
        System.out.println("Schedule     : " + schedule);
    }

    @Override
    public String toString() {
        return trainNumber + " - " + trainName;
    }
}