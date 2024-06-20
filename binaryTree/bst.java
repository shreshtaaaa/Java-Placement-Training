//check whether a binary tree is a bst or not
//bst->elements in left is less than parent.. and in right is greater than parent
//to find bst.. take max of left branch and min of right branch.. compare that with the root

class Node{
    int data;
    Node left;;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class bst {
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left=new Node(20);
        root.right=new Node(60);
        root.left.left=new Node(10);
        root.left.right=new Node(30);
        root.right.left=new Node(50);
        root.right.right=new Node(70);
        if(isABST(root, null, null)){
            System.out.println("yes it is a bst");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean isABST(Node root, Node left, Node right) {
        // Base case
        if (root == null) {
            return true;
        }

        // If left node exists and its value is greater than the current node, return false
        if (left != null && root.data <= left.data) {
            return false;
        }

        // If right root exists and its value is less than the current node, return false
        if (right != null && root.data >= right.data) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isABST(root.left, left, root) && isABST(root.right, root, right);
    }
    
}

// void max(Node root){
// if(root==null) return;
// int leftmax=max(root.left);
// int rightmax=max(root.right);
// int value;
// if(leftmax>rightmax)
// value=leftmax;
// else
// value=rightmax;
// if root>value
// value=root;
// return root;
// }
// void min(Node root){
// if(root==null) return;
// int leftmin=min(root.left);
// int rightmin=min(root.right);
// int value;
// if(leftmin<rightmin)
// value=leftmin;
// else
// value=rightmin;
// if root<value
// value=root;
// return root;
// }

//int maxvalue=max(root.left);
//int minvalue=min(root.right);
//if(root>maxvalue && root<minvalue){
//sout("isabinary tree")
//}
//else{sout("no");}