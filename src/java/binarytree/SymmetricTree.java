package binarytree;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        inverseTree(root.left, root.right);
    }

    public static boolean inverseTree(Node nodeLeft, Node nodeRight) {
        if (nodeLeft == null && nodeRight == null) {
            return true;
        }

        if (nodeLeft == null || nodeRight == null) {
            return false;
        }

        if (nodeLeft.val != nodeRight.val) {
            return false;
        }

        return inverseTree(nodeLeft.left, nodeRight.right) && inverseTree(nodeLeft.right, nodeRight.left);
    }
}
