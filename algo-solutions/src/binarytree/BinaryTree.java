package binarytree;

import java.util.Objects;
public class BinaryTree {

  Node root;

  private Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.val) {
      current.left = addRecursive(current.left, value);
    } else if (value > current.val) {
      current.right = addRecursive(current.right, value);
    } else {
      // value already exists
      return current;
    }

    return current;
  }

  public void add(int value) {
    root = addRecursive(root, value);
  }

  public static BinaryTree createBinaryTree() {
    BinaryTree bt = new BinaryTree();

    bt.add(20);
    bt.add(23);
    bt.add(22);
    bt.add(24);
    bt.add(18);
    bt.add(12);
    bt.add(19);

    return bt;
  }

  private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
      return false;
    }

    if (value == current.val) {
      return true;
    }
    return value < current.val
        ? containsNodeRecursive(current.left, value)
        : containsNodeRecursive(current.right, value);
  }

  public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
  }

  public String traversePreOrder() {
    if (root == null) {
      return "";
    }

    StringBuilder sb = new StringBuilder();
    sb.append(root.val);

    String pointerRight = "└──";
    String pointerLeft = (root.right != null) ? "├──" : "└──";

    traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
    traverseNodes(sb, "", pointerRight, root.right, false);

    sb.append("\n\n├── = left node || └── = right node");
    return sb.toString();
  }

  public void traverseNodes(StringBuilder sb, String padding, String pointer, Node node,
                                   boolean hasRightSibling) {
    if (node != null) {
      sb.append("\n");
      sb.append(padding);
      sb.append(pointer);
      sb.append(node.val);

      StringBuilder paddingBuilder = new StringBuilder(padding);
      if (hasRightSibling) {
        paddingBuilder.append("│  ");
      } else {
        paddingBuilder.append("   ");
      }

      String paddingForBoth = paddingBuilder.toString();
      String pointerRight = "└──";
      String pointerLeft = (node.right != null || Objects.equals(pointer, "├──")) ? "├──" : "└──";

      traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
      traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
    }

  }

  private Node deleteRecursive(Node current, int value) {
    if (current == null) {
      return null;
    }

    if (value == current.val) {
      if (current.left == null && current.right == null) {
        return null;
      }

      if (current.right == null) {
        return current.left;
      }

      if (current.left == null) {
        return current.right;
      }

      int smallestValue = findSmallestValue(current.right);
      current.val = smallestValue;
      current.right = deleteRecursive(current.right, smallestValue);
      return current;

    }
    if (value < current.val) {
      current.left = deleteRecursive(current.left, value);
      return current;
    }
    current.right = deleteRecursive(current.right, value);
    return current;
  }

  private int findSmallestValue(Node root) {
    return root.left == null ? root.val : findSmallestValue(root.left);
  }

  public void delete(int value) {
    root = deleteRecursive(root, value);
  }

  public void traverseTree() {
    traverseInOrder(root);
  }
  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.val);
      traverseInOrder(node.right);
    }
  }

  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.val);
    }
  }
}
