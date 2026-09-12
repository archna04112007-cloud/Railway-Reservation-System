import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PlatformManager {

    private List<Platform> platforms;
    private List<PlatformAllocation> allocations;

    public PlatformManager() {
        platforms = new ArrayList<>();
        allocations = new ArrayList<>();
    }

    // Add a platform
    public void addPlatform(Platform platform) {
        platforms.add(platform);
    }

    // Display all platforms
    public void displayPlatforms() {

        System.out.println("\n----- Platform Status -----");

        for (Platform platform : platforms) {
            System.out.println(platform);
        }
    }

    // Check whether a platform has a time conflict
    public boolean checkConflict(
            Platform platform,
            LocalTime arrival,
            LocalTime departure,
            LocalDate date) {

        for (PlatformAllocation allocation : allocations) {

            // Check same platform
            if (allocation.getPlatform().getPlatformId()
                    != platform.getPlatformId()) {
                continue;
            }

            // Check same date
            if (!allocation.getDate().equals(date)) {
                continue;
            }

            // Check time overlap
            if (allocation.isTimeOverlap(
                    arrival,
                    departure)) {

                return true;
            }
        }

        return false;
    }

    // Find a platform without conflict
    public Platform findAvailablePlatform(
            String stationId,
            LocalTime arrival,
            LocalTime departure,
            LocalDate date) {

        for (Platform platform : platforms) {

            // Platform must belong to the required station
            if (!platform.getStationId().equals(stationId)) {
                continue;
            }

            // Platform under maintenance cannot be used
            if (platform.getStatus()
                    == PlatformStatus.MAINTENANCE) {
                continue;
            }

            // Check time conflict
            if (!checkConflict(
                    platform,
                    arrival,
                    departure,
                    date)) {

                return platform;
            }
        }

        return null;
    }

    // Allocate a platform to a train
    public Platform allocatePlatform(
            Train train,
            String stationId,
            LocalTime arrival,
            LocalTime departure,
            LocalDate date) {

        Platform platform =
                findAvailablePlatform(
                        stationId,
                        arrival,
                        departure,
                        date);

        if (platform == null) {

            System.out.println(
                    "No platform available for Train "
                    + train.getTrainNumber());

            return null;
        }

        platform.markOccupied();

        String allocationId =
                "A" + (allocations.size() + 1);

        PlatformAllocation allocation =
                new PlatformAllocation(
                        allocationId,
                        train,
                        platform,
                        arrival,
                        departure,
                        date);

        allocations.add(allocation);

        System.out.println(
                "Train "
                + train.getTrainNumber()
                + " assigned to Platform "
                + platform.getPlatformId());

        return platform;
    }

    // Reassign a train to another platform
    public void reassignPlatform(
            PlatformAllocation allocation,
            Platform newPlatform) {

        if (newPlatform == null) {

            System.out.println(
                    "No alternative platform available.");

            return;
        }

        Platform oldPlatform =
                allocation.getPlatform();

        oldPlatform.markAvailable();

        newPlatform.markOccupied();

        allocation.setPlatform(newPlatform);

        System.out.println(
                "Train "
                + allocation.getTrain().getTrainNumber()
                + " reassigned to Platform "
                + newPlatform.getPlatformId());
    }

    // Display all allocations
    public void displayAllocations() {

        System.out.println(
                "\n----- Platform Allocations -----");

        if (allocations.isEmpty()) {

            System.out.println(
                    "No allocations found.");

            return;
        }

        for (PlatformAllocation allocation : allocations) {
            System.out.println(allocation);
        }
    }
}
