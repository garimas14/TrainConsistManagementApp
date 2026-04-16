public class Sortpassbybogie {

    public static void main(String[] args) {

        // Original passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original capacities
        System.out.println("======================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("======================================\n");

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Perform Bubble Sort
        bubbleSort(capacities);

        // Display sorted capacities
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);

        System.out.println("\nUC16 sorting completed...");
    }

    // Bubble Sort Logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
