//if our datatype is int, then generics is <Integer>
//if our datatype is string, then generics is <String>
//if our datatype is double, then generics is <Double>
//if our datatype is char, then generics is <Character>
//if our datatype is boolean, then generics is <Boolean>
//if our datatype is float, then generics is <Float>

//write a prgm to create a arraylist which enters students names of string type only

import java.util.ArrayList;

public class genericArrayL {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Get an element from the ArrayList
        String name = arrayList.get(1);
        System.out.println("Element at index 1: " + name);

        // Remove an element from the ArrayList
        arrayList.remove(0);
        System.out.println("ArrayList after removal: " + arrayList);


        
    }
}
