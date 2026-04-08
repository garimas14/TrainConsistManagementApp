import java.util.*;
import java.util.stream.*;


public class PerformanceComparison {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("======================================");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 50 + (i % 50)));
        }

        // Loop timing
        long startLoop = System.nanoTime();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                // just filtering, no storage needed
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream timing
        long startStream = System.nanoTime();

        bogies.stream()
                .filter(b -> b.capacity > 60)
                .count(); // terminal operation

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // EXACT OUTPUT FORMAT
        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}