import java.util.HashSet;

public class TrackUniqueBogiesID {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=================================");

        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIDs.add("BG104");
        bogieIDs.add("BG103");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogieIDs);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}