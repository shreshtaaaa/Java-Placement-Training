
//taversal of a linked list
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class ll{
    public static void main(String[] args) {
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;  
        node4.next=null;
        traverseLinkedList(node1);
    }
    public static void traverseLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}