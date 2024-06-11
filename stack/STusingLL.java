class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node head;
    int capacity = 7;
    int count = 0;

    void push(int data) {
        if (count >= capacity) {
            System.out.println("Overflow");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
    }

    void pop() {
        if (head == null) {
            System.out.println("Underflow");
            return;
        }

        head = head.next;
        count--;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class STusingLL {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.push(60);
        st1.push(70);
        // st1.push(80); // Uncomment to test overflow

        System.out.println("Stack elements after push operations:");
        st1.display();

        st1.pop();
        st1.pop();

        System.out.println("Stack elements after pop operations:");
        st1.display();
    }}