import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 🔹 Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        System.out.println("\nBogie Capacity Mapping:");

        // 🔹 Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // 🔹 Example lookup
        System.out.println("\nCapacity of Sleeper: " +
                bogieCapacityMap.get("Sleeper"));

        System.out.println("\nSystem ready for analytics and validation...");
    }
}