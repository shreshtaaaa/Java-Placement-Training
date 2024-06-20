import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    TreeSet<Integer> arr = new TreeSet<>();

    Node(int data) {
        this.data = data;
    }

    void collect(Node root) {
        if (root == null) return;
        collect(root.left);
        arr.add(root.data);
        collect(root.right);
    }

    void toBst(Node root) {
        if (root == null) return;
        toBst(root.left);
        root.data = arr.pollFirst(); // Use pollFirst() to get and remove the first element
        toBst(root.right);
    }

    void traverse(Node root) {
        if (root == null) return;
        traverse(root.left);
        System.out.print(root.data + " ");
        traverse(root.right);
    }
}

class convertToBST{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Step 1: Collect the inorder traversal
        root.collect(root);
        System.out.println("Inorder traversal of original tree: " + root.arr);

        // Step 3: Convert the sorted array back to BST
        root.toBst(root);

        // Step 4: Traverse the BST to verify
        System.out.print("Inorder traversal of BST: ");
        root.traverse(root);
        System.out.println();
    }
}