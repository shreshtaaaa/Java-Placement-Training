import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Get an element from the LinkedList
        String name = linkedList.get(1);
        System.out.println("Element at index 1: " + name);

        // Remove an element from the LinkedList
        linkedList.remove(0);
        System.out.println("LinkedList after removal: " + linkedList);

        
    }
}
