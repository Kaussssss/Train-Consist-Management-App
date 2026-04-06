import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 🔹 Add bogie IDs (with intentional duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nBogie IDs after insertion (duplicates attempted):");
        System.out.println(bogieIDs);

        // 🔹 Check existence
        System.out.println("\nDoes BG101 exist? " + bogieIDs.contains("BG101"));

        // 🔹 Final unique set
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}