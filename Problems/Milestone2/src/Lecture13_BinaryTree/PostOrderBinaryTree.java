package Lecture13_BinaryTree;

public class PostOrderBinaryTree {
    public static void postOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here

        //Your code goes here
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
