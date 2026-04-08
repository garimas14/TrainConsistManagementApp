import java.util.*;
import java.util.stream.*;

public class FilterPassengerBogies {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("======================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Filter bogies using Stream (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        System.out.println("\nUC8 filtering completed...");
    }
}
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> " + capacity);
    }
}