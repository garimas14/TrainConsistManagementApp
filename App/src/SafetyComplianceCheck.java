import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public void display() {
        System.out.println(type + " -> " + cargo);
    }
}

public class SafetyComplianceCheck {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("======================================");

        // Create bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // 👉 Uncomment to test unsafe case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie b : bogies) {
            b.display();
        }

        // Safety check
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // ✅ Correct output format
        System.out.println("\nSafety Compliance Result:");
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}