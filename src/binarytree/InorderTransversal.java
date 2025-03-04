package binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InorderTransversal {
    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.createBinaryTree();
        List<Integer> list = new ArrayList<>();
        printInOrder(tree.root, list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void printInOrder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        printInOrder(root.left, list);

        list.add(root.val);

        printInOrder(root.right, list);
    }
}
