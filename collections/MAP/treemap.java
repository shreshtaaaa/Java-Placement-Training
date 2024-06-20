//ascending order of keys

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Remove a key-value pair
        treeMap.remove("Banana");
        System.out.println("After removing 'Banana': " + treeMap);

        // Check if a key exists
        boolean hasCherry = treeMap.containsKey("Cherry");
        System.out.println("TreeMap contains 'Cherry': " + hasCherry);

        // Iterate over the key-value pairs
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
