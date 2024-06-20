//no order
//key-value pairs
import java.util.HashMap;
import java.util.Map;

public class hashmap{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 30);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Remove a key-value pair
        hashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + hashMap);

        // Check if a key exists
        boolean hasCherry = hashMap.containsKey("Cherry");
        System.out.println("HashMap contains 'Cherry': " + hasCherry);

        // Iterate over the key-value pairs
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}