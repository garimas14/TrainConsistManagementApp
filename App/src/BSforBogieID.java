import java.util.Arrays;
public class BSforBogieID {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================\n");
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        String searchKey = "BG205";
        System.out.println("Original Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        Arrays.sort(bogieIds);
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        boolean found = binarySearch(bogieIds, searchKey);
        if (found) {
            System.out.println("\nBogie " + searchKey + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchKey + " NOT found in train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }
    public static boolean binarySearch(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(arr[mid]);
            if (comparison == 0) {
                return true;
            }
            else if (comparison > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}