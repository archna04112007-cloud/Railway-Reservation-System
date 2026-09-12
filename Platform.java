public class Platform {

    private int platformId;
    private String stationId;
    private PlatformStatus status;

    public Platform(int platformId, String stationId) {
        this.platformId = platformId;
        this.stationId = stationId;
        this.status = PlatformStatus.AVAILABLE;
    }

    public int getPlatformId() {
        return platformId;
    }

    public String getStationId() {
        return stationId;
    }

    public PlatformStatus getStatus() {
        return status;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStatus(PlatformStatus status) {
        this.status = status;
    }

    public void markAvailable() {
        status = PlatformStatus.AVAILABLE;
    }

    public void markOccupied() {
        status = PlatformStatus.OCCUPIED;
    }

    public void markMaintenance() {
        status = PlatformStatus.MAINTENANCE;
    }

    @Override
    public String toString() {
        return "Platform " + platformId
                + " | Station: " + stationId
                + " | Status: " + status;
    }
}