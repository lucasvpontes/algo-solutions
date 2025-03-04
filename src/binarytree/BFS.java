package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        // Perform level order traversal
        ArrayList<ArrayList<Integer>> res = levelOrder(Node.create());

        // Print the result
        for (ArrayList<Integer> level : res)
            for (int data : level)
                System.out.print(data + " ");
    }

    // Iterative method to find height of Binary Tree
    static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();

        // Create an empty queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Enqueue Root
        q.add(root);
        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                // Add front of queue and remove it from queue
                Node node = q.poll();
                if (node != null) {
                    res.get(currLevel).add(node.val);
                }
                // Enqueue left child
                if (node.left != null)
                    q.add(node.left);

                // Enqueue right child
                if (node.right != null)
                    q.add(node.right);
            }
            currLevel++;
        }
        return res;
    }
}
