//insertion order
//key value pair
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmap {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Remove a key-value pair
        linkedHashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashMap);

        // Check if a key exists
        boolean hasCherry = linkedHashMap.containsKey("Cherry");
        System.out.println("LinkedHashMap contains 'Cherry': " + hasCherry);

        // Iterate over the key-value pairs
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
