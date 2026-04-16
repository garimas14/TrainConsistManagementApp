public class LSforBogieID {

    public static void main(String[] args) {

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key (fixed as per expected output)
        String searchKey = "BG309";

        System.out.println("======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("======================================\n");

        // Display available bogie IDs (each on new line)
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result (matching exact wording)
        if (found) {
            System.out.println("\nBogie " + searchKey + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchKey + " NOT found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {
        for (String element : arr) {
            if (element.equals(key)) {
                return true; // Early exit
            }
        }
        return false;
    }
}