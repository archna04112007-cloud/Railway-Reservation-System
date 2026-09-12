public class Station {

    private String stationId;
    private String stationName;
    private String city;

    // Constructor
    public Station(String stationId, String stationName, String city) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.city = city;
    }

    // Getters
    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return stationId + " - " + stationName + ", " + city;
    }
}
