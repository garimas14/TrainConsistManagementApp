public class SafeCargoAssignment {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // GoodsBogie class
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public void assignCargo(String cargo) {
            try {
                // Safety rule
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + type + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
        System.out.println("======================================");

        GoodsBogie b1 = new GoodsBogie("Cylindrical", "");
        b1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie b2 = new GoodsBogie("Rectangular", "");
        b2.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie b3 = new GoodsBogie("Open", "");
        b3.assignCargo("Coal");

        System.out.println("\nUC15 execution completed...");
    }
}