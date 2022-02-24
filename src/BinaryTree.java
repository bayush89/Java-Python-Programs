/*Inorder - left->root->right
Preorder - root->left->right
Postorder - left->right->root*/
class Node {
    int key;
    Node left, right;
    public Node(int value) {
        key = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }
    void printInorder(Node node) {
        if(node == null)
            return;
        printInorder(node.left);
        System.out.println(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node) {
        if(node == null)
            return;
        System.out.println(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node node) {
        if(node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key + " ");
    }
    void printInorder() {
        printInorder(root);
    }
    void printPreorder() {
        printPreorder(root);
    }
    void printPostorder() {
        printPostorder(root);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(
                "Preorder traversal of the binary tree is: ");
        tree.printPreorder();
        System.out.println(
                "\nInorder traversal of the binary tree is: ");
        tree.printInorder();
        System.out.println(
                "\nPostorder traversal of the binary tree is: ");
        tree.printPostorder();
    }
}