import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create bogie list (reuse previous UC style)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 🔹 Stream aggregation (total capacity)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nSystem ready for capacity analytics...");
    }
}