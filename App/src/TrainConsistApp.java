import java.util.regex.*;
import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // 🔹 Input from user
        System.out.print("\nEnter Train ID (format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // 🔹 Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // 🔹 Match input
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // 🔹 Validation
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID is VALID ✅");
        } else {
            System.out.println("\nTrain ID is INVALID ❌");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        System.out.println("\nSystem ready for validated processing...");
    }
}