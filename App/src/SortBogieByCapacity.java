import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " -> " + capacity);
    }
}

public class SortBogieByCapacity {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("======================================");

        // Create List
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Before Sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After Sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nUC7 sorting completed...");
    }
}