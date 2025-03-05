package binarytree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        if (checkIsBalanced(root) == -1) {
            return false;
        } else {
            return true;
        }

    }

    public int checkIsBalanced(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkIsBalanced(root.left);

        int rightHeight = checkIsBalanced(root.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
