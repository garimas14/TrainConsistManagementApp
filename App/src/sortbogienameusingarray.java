import java.util.Arrays;

public class sortbogienameusingarray {

    public static void main(String[] args) {

        // Array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original bogie names
        System.out.println("======================================");
        System.out.println("UC17 - Sorting Bogie Names using Arrays.sort()");
        System.out.println("======================================\n");

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display sorted bogie names
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}