package binarytree;

public class MaxDepth {
    public static void main(String[] args) {
        System.out.println(maxDepth(Node.create()));
    }

    // test
    public static int maxDepth(Node root) {
       if (root == null) {
       return 0;
       }

       int left = maxDepth(root.left);
       int right = maxDepth(root.right);

       return 1 + Math.max(left, right);
    }
}
