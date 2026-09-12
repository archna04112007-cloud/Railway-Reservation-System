import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // PART 1: TRAIN + ROUTE + STATION + SCHEDULE
        // ==========================================

        System.out.println("==========================================");
        System.out.println("   PART 1: TRAIN MANAGEMENT TEST");
        System.out.println("==========================================");

        // Create stations
        Station delhi = new Station(
                "NDLS",
                "New Delhi",
                "Delhi"
        );

        Station agra = new Station(
                "AGRA",
                "Agra Cantt",
                "Agra"
        );

        Station pune = new Station(
                "PUNE",
                "Pune Junction",
                "Pune"
        );

        // Create route
        Route route = new Route(
                "R001",
                delhi,
                pune
        );

        // Add Agra between Delhi and Pune
        route.addStation(agra);

        // Display route
        route.displayRoute();

        // Create schedule
        Schedule schedule = new Schedule(
                LocalDate.of(2026, 9, 20),
                LocalTime.of(6, 0),
                LocalTime.of(18, 30)
        );

        // Create train
        Train train1 = new Train(
                12951,
                "Rajdhani Express",
                "Express",
                route,
                schedule
        );

        // Display train
        System.out.println();
        train1.displayTrainDetails();


        // ==========================================
        // PART 2: PLATFORM ALLOCATION
        // ==========================================

        System.out.println("\n==========================================");
        System.out.println("   PART 2: PLATFORM ALLOCATION TEST");
        System.out.println("==========================================");

        // Create Platform Manager
        PlatformManager manager = new PlatformManager();

        // Create platforms at Pune
        Platform platform1 = new Platform(1, "PUNE");
        Platform platform2 = new Platform(2, "PUNE");
        Platform platform3 = new Platform(3, "PUNE");

        // Add platforms
        manager.addPlatform(platform1);
        manager.addPlatform(platform2);
        manager.addPlatform(platform3);

        // Create second train
        Train train2 = new Train(
                12952,
                "Superfast Express",
                "Superfast",
                route,
                schedule
        );

        // Allocate first train
        System.out.println("\nAllocating Train 12951...");

        manager.allocatePlatform(
                train1,
                "PUNE",
                LocalTime.of(10, 0),
                LocalTime.of(10, 30),
                LocalDate.of(2026, 9, 20)
        );

        // Allocate second train
        // This overlaps with Train 12951
        System.out.println("\nAllocating Train 12952...");

        manager.allocatePlatform(
                train2,
                "PUNE",
                LocalTime.of(10, 15),
                LocalTime.of(10, 45),
                LocalDate.of(2026, 9, 20)
        );

        // Display platforms
        manager.displayPlatforms();

        // Display allocations
        manager.displayAllocations();

        System.out.println("\n==========================================");
        System.out.println("        ALL TESTS COMPLETED");
        System.out.println("==========================================");
    }
}