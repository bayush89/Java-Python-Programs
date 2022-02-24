/*      1. Initialize current as root
        2. While current is not NULL
        If the current does not have left child
        a) Print current’s data
        b) Go to the right, i.e., current = current->right
        Else
        a) Find rightmost node in current left subtree OR
        node whose right child == current.
        If we found right child == current
        a) Update the right child as NULL of that node whose right child is current
        b) Print current’s data
        c) Go to the right, i.e. current = current->right
        Else
        a) Make current as the right child of that rightmost
        node we found; and
        b) Go to this left child, i.e., current = current->left*/

public class BinaryTreeWithoutStack {
    Node root;
    void traversal(Node root) {
        Node current, pre;
        if(root == null)
            return;
        current = root;
        while(current != null) {
            if(current.left == null) {
                System.out.print(current.key + " ");
                current = current.right;
            }
            else {
                pre = current.left;
                while(pre.right != null && pre.right != current)
                    pre = pre.right;
                if(pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }
                else {
                    pre.right = null;
                    System.out.print(current.key + " ");
                    current = current.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        BinaryTreeWithoutStack tree = new BinaryTreeWithoutStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.traversal(tree.root);
    }
}