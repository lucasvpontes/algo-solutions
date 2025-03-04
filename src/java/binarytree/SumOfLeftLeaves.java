package binarytree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.createBinaryTree();
        System.out.println(sumOfLeftLeaves(binaryTree.root, false));
    }

    public static int sumOfLeftLeaves(Node root, boolean isLeft) {
        if (root == null) {
            return 0;
        }

        if(isLeft && root.left == null && root.right == null) {
            return root.val;
        }

        int leftSum = sumOfLeftLeaves(root.left, true);
        int rightSum =  sumOfLeftLeaves(root.right, false);

        return leftSum + rightSum;
    }


}
