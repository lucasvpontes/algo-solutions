package binarytree;

public class Main {

  public static void main(String[] args) {

    BinaryTree binaryTree = BinaryTree.createBinaryTree();

    System.out.println(binaryTree.traversePreOrder());

    System.out.println(binaryTree.containsNode(4));

    binaryTree.traverseTree();

  }
}