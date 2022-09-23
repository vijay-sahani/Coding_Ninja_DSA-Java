package Lecture13_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        pendingNodes.offer(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNodes.poll();
            int left=-1;
            int right=-1;
            if(front.left!=null){
                left=front.left.data;
                pendingNodes.offer(front.left);
            }
            if (front.right!=null){
                right=front.right.data;
                pendingNodes.offer(front.right);
            }
            System.out.println(front.data+":L:"+left+",R:"+right);
        }
    }
}
