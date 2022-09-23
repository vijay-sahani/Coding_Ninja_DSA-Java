package Lecture13_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner sc, String node) {
        int rootData;
        System.out.printf("Enter %s data:\n", node);
        rootData = sc.nextInt();
        if (rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(sc, "left");
        root.right = takeInput(sc, "right");
        return root;
    }

    public static void printInorder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root :");
        int rootData = sc.nextInt();
        if (rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
        pendingNode.offer(root);
        while (!pendingNode.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNode.poll();
            System.out.println("Enter left child of " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                front.left = new BinaryTreeNode<>(left);
                pendingNode.offer(front.left);
            }
            System.out.println("Enter right child of " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                front.right = new BinaryTreeNode<>(right);
                pendingNode.offer(front.right);
            }

        }
        return root;
    }

    public static int countNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int op1 = 1 + HeightOfBinaryTree.height(root.left) + HeightOfBinaryTree.height(root.right);
        int op2 = diameterOfBinaryTree(root.left);
        int op3 = diameterOfBinaryTree(root.right);
        return Math.max(op1, Math.max(op2, op3));
    }

    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> left = heightDiameter(root.left);
        Pair<Integer, Integer> right = heightDiameter(root.right);
        int height = 1 + Math.max(left.height, right.height);
        int op1 = left.height + right.height;
        int op2 = left.diameter, op3 = right.diameter;
        int diameter = Math.max(op1, Math.max(op2, op3));
        return new Pair<>(height, diameter);
    }


    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput(new Scanner(System.in), "root");
        BinaryTreeNode<Integer> root = takeInputLevelWise();
//        printInorder(root);

        System.out.println(diameterOfBinaryTree(root));

        Pair<Integer, Integer> hd = heightDiameter(root);
        System.out.println("Height:" + hd.height + " Diameter " + hd.diameter);


    }
}
