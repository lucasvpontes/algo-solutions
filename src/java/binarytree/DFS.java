package binarytree;

public class DFS {
//    Inorder: 4 2 5 1 3 left > up > right > repeat
//    Preorder: 1 2 4 5 3 up > left > right > repeat
//    Postorder: 4 5 2 3 1 left > right > up > repeat


    /* Given a binary tree, print its nodes in inorder*/
    static void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    static void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.val + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    /* Given a binary tree, print its nodes according to the
  "bottom-up" postorder traversal. */
    static void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.val + " ");
    }

    // Driver code
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
            "\nInorder traversal of binary tree is ");
        printInorder(tree.root);
        System.out.println(
            "\nPreorder traversal of binary tree is ");
        printPreorder(tree.root);
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        printPostorder(tree.root);
    }
}
