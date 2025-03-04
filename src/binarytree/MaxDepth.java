package binarytree;

public class MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
    }
}
