import java.util.ArrayList;
import java.util.List;

public class Route {

    private String routeId;
    private Station source;
    private Station destination;
    private List<Station> stations;

    // Constructor
    public Route(String routeId, Station source, Station destination) {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.stations = new ArrayList<>();

        // Add source and destination automatically
        stations.add(source);
        stations.add(destination);
    }

    // Add an intermediate station
    public void addStation(Station station) {
    stations.add(stations.size() - 1, station);
    

    }

    // Remove a station
    public void removeStation(Station station) {
        stations.remove(station);
    }

    // Display complete route
    public void displayRoute() {

        System.out.println("Route: " + routeId);

        for (int i = 0; i < stations.size(); i++) {

            System.out.print(stations.get(i).getStationName());

            if (i < stations.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    // Getters
    public String getRouteId() {
        return routeId;
    }

    public Station getSource() {
        return source;
    }

    public Station getDestination() {
        return destination;
    }

    public List<Station> getStations() {
        return stations;
    }

    // Setters
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setSource(Station source) {
        this.source = source;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Route " + routeId + ": "
                + source.getStationName()
                + " -> "
                + destination.getStationName();
    }
}