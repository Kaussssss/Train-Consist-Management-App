import java.util.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Sort using Comparator (ascending capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Optional: Descending sort (for planning high capacity first)
        bogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for capacity-based planning...");
    }
}