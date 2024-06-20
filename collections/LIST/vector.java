import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Alice");
        vector.add("Bob");
        vector.add("Charlie");

        // Print the Vector
        System.out.println("Vector: " + vector);

        // Get an element from the Vector
        String name = vector.get(1);
        System.out.println("Element at index 1: " + name);

        // Remove an element from the Vector
        vector.remove(0);
        System.out.println("Vector after removal: " + vector);

        
    }
}
