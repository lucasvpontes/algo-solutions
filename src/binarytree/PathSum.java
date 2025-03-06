package binarytree;

public class PathSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);

        System.out.println(hasPathSum(root, 1));
    }

    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
}