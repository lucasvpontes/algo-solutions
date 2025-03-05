package binarytree;

public class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
    right = null;
    left = null;
  }

  public static Node create() {
    // Create binary tree
    //      1
    //     / \
    //    3   2
    //   /     \
    //  7        4
    //          /  \
    //         6    5
    Node root = new Node(1);
    root.left = new Node(3);
    root.left.left = new Node(7);
    root.right = new Node(2);
    root.right.right = new Node(4);
    root.right.right.left = new Node(6);
    root.right.right.right = new Node(5);

    return root;
  }
}