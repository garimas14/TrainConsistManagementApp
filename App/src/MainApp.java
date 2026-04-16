import java.util.*;

public class MainApp {

    // Search Service (inner class)
    static class TrainSearchService {

        public boolean searchBogie(List<String> bogies, String searchKey) {

            // Fail-fast validation
            if (bogies == null || bogies.isEmpty()) {
                throw new IllegalStateException(
                        "No bogies available in train. Cannot perform search."
                );
            }

            // Search logic
            for (String bogie : bogies) {
                if (bogie.equals(searchKey)) {
                    return true;
                }
            }

            return false;
        }
    }

    // Main method (entry point)
    public static void main(String[] args) {

        TrainSearchService service = new TrainSearchService();

        List<String> bogies = new ArrayList<>();

        // 🔴 Case 1: Empty list → Exception
        try {
            System.out.println(service.searchBogie(bogies, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // 🟢 Case 2: Add bogies
        bogies.add("BG101");
        bogies.add("BG205");
        bogies.add("BG309");

        // 🟢 Case 3: Found
        boolean found = service.searchBogie(bogies, "BG205");
        System.out.println("Search BG205: " + found);

        // 🟢 Case 4: Not found
        boolean notFound = service.searchBogie(bogies, "BG999");
        System.out.println("Search BG999: " + notFound);

        // 🟢 Case 5: Single element
        List<String> single = Arrays.asList("BG101");
        boolean singleResult = service.searchBogie(single, "BG101");
        System.out.println("Single element search: " + singleResult);
    }
}