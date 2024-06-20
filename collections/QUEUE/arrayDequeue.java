package QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDequeue {
    public static void main(String[] args) {
        // Create an ArrayDeque with generic type String
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("Element 1");        // Adds to the tail
        deque.addFirst("Element 2");   // Adds to the head
        deque.addLast("Element 3");    // Adds to the tail
        deque.push("Element 4");       // Adds to the head (same as addFirst)
        deque.offer("Element 5");      // Adds to the tail (same as add)
        deque.offerFirst("Element 6"); // Adds to the head
        deque.offerLast("Element 7");  // Adds to the tail

        // Display the deque
        System.out.println("ArrayDeque: " + deque);

        // Remove elements from the deque
        String firstElement = deque.removeFirst(); // Removes from the head
        System.out.println("Removed First Element: " + firstElement);

        String lastElement = deque.removeLast();   // Removes from the tail
        System.out.println("Removed Last Element: " + lastElement);

        // Display the deque after removals
        System.out.println("ArrayDeque after removals: " + deque);

        // Peek at the head and tail elements
        String headElement = deque.peekFirst();
        System.out.println("Head Element: " + headElement);

        String tailElement = deque.peekLast();
        System.out.println("Tail Element: " + tailElement);

        // Iterate over the elements in the deque
        System.out.println("Iterating over ArrayDeque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
