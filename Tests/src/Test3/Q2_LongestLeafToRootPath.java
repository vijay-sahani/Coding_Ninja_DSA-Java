package Test3;

import java.util.ArrayList;

/*
Longest Leaf to root path
Send Feedback
Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
Input format :

Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Line 1 : Binary Tree 1 (separated by space)

Sample Input 1 :
 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1 :
9
3
6
5
 */
public class Q2_LongestLeafToRootPath {
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
        // Referred from geeksforgeeks
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> left = longestRootToLeafPath(root.left);
        ArrayList<Integer> right = longestRootToLeafPath(root.right);

        if (left.size() > right.size()) left.add(root.data);
        else right.add(root.data);

        return left.size() > right.size() ? left : right;
    }


}
