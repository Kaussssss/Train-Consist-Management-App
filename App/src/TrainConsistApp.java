import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 LinkedHashSet for ordered + unique bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored)

        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // 🔹 Check existence
        System.out.println("\nDoes Sleeper exist? " + trainFormation.contains("Sleeper"));

        // 🔹 Final output
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nDuplicates automatically removed. Order preserved.");
    }
}