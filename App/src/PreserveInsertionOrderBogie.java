import java.util.LinkedHashSet;

public class PreserveInsertionOrderBogie {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=================================");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates.");
    }
}