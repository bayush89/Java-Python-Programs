class tNode {
    int key;
    tNode left, right;
    public tNode(int value) {
        key = value;
        left = right = null;
    }
}
public class BinaryTreeSearch {
    tNode root;
    static int findMax(tNode node) {
        if(node == null)
            return Integer.MIN_VALUE;
        int res = node.key;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
        if(lres > res)
            res = lres;
        if(rres > res)
            res = rres;
        return res;
    }
    static int findMin(tNode node) {
        if(node == null)
            return Integer.MAX_VALUE;
        int res = node.key;
        int lres = findMin(node.left);
        int rres = findMin(node.right);
        if(lres < res)
            res = lres;
        if(rres < res)
            res = rres;
        return res;
    }
    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();
        tree.root = new tNode(2);
        tree.root.left = new tNode(7);
        tree.root.right = new tNode(5);
        tree.root.left.right = new tNode(6);
        tree.root.left.right.left = new tNode(1);
        tree.root.left.right.right = new tNode(11);
        tree.root.right.right = new tNode(9);
        tree.root.right.right.left = new tNode(4);
        System.out.println("Maximum element is:"+tree.findMax(tree.root));
        System.out.println("Minimum element is:"+tree.findMin(tree.root));
    }
}
