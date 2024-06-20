//convert binary tree to binary search tree

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BTtoBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Binary Tree before conversion to BST:");
        inorder(root);
        System.out.println();

        convertBTtoBST(root);

        System.out.println("Binary Tree after conversion to BST:");
        inorder(root);
    }

    // In-order traversal to print the tree
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Count the number of nodes in the tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    // Method to store the nodes in an array
    public static void storeInOrder(Node node, int[] nodes, int[] index) {
        if (node == null) {
            return;
        }
        storeInOrder(node.left, nodes, index);
        nodes[index[0]++] = node.data;
        storeInOrder(node.right, nodes, index);
    }

    // Method to convert the tree to BST
    public static void convertToBST(Node node, int[] nodes, int[] index) {
        if (node == null) {
            return;
        }
        convertToBST(node.left, nodes, index);
        node.data = nodes[index[0]++];
        convertToBST(node.right, nodes, index);
    }

    // Method to convert binary tree to binary search tree
    public static void convertBTtoBST(Node root) {
        if (root == null) {
            return;
        }

        // Step 1: Count the total number of nodes
        int n = countNodes(root);

        // Step 2: Store the in-order traversal of the tree in an array
        int[] nodes = new int[n];
        int[] index = {0};
        storeInOrder(root, nodes, index);

        // Step 3: Sort the array
        java.util.Arrays.sort(nodes);

        // Step 4: Convert the tree to BST by reassigning sorted values
        index[0] = 0;
        convertToBST(root, nodes, index);
    }
}