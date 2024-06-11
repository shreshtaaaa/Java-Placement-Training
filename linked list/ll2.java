import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ll2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;

        while (true) {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Traverse and Print");
            System.out.println("2. Insert Node at End");
            System.out.println("3. Delete Node at End");
            System.out.println("4. Insert Node at Beginning");
            System.out.println("5. Delete Node at Beginning");
            System.out.println("6. Reverse the Linked List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    traverseAndPrint(head);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int dataEnd = scanner.nextInt();
                    insertNodeEnd(head, dataEnd);
                    break;
                case 3:
                    deleteNodeEnd(head);
                    break;
                case 4:
                    System.out.print("Enter data to insert at beginning: ");
                    int dataBegin = scanner.nextInt();
                    head = insertAtBeginning(head, dataBegin);
                    break;
                case 5:
                    head = deleteBeg(head);
                    break;
                case 6:
                    head = reverse(head);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }

    // Method to traverse and print the linked list
    public static void traverseAndPrint(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node currentNode = head;
        System.out.print("Linked list: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
       System.out.println();
    }

    // method to insert a node at the end
    public static void insertNodeEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // method to delete a node from the end
    public static void deleteNodeEnd(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    // method to insert a node at the beginning
    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // method to delete a node from the beginning
    public static Node deleteBeg(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return null;
        }
        head = head.next;
        return head;
    }

    // method to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }
}