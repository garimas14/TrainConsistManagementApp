 class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}
public class InvalidBogieCapacity{
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("======================================");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.name + " -> " + b1.capacity);

            // Invalid bogie
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + b2.name + " -> " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}