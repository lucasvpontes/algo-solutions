package binarytree;

import static binarytree.BinaryTree.createBinaryTree;

public class SameTree {
    public static void main(String[] args) {
        System.out.println(isSameTree(createBinaryTree().root, createBinaryTree().root));
    }

    public static boolean isSameTree(Node p, Node q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
