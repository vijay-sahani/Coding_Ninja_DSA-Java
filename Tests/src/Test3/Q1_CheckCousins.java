package Test3;

import org.w3c.dom.Node;

import java.util.HashMap;

/*
Check cousins
Send Feedback
Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins of each other or not. Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
Do it in O(n).
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
Line 2 : integer value of p
Line 3 : Integer value of q
Output format :
true or false
Constraints :
1 <= N <= 10^5
Sample Input :
5 6 10 2 3 4 -1 -1 -1 -1 9 -1 -1 -1 -1
2
4
Sample Output :
true
 */

class NodeInfo {
    int level, parent;

    NodeInfo(int level, int parent) {
        this.level = level;
        this.parent = parent;
    }
}

public class Q1_CheckCousins {
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        // Write your code here
        HashMap<Integer, NodeInfo> map = new HashMap<>();
        buildLevel(root, map, 0, -1);
/*
       Just for verification--->
        for (Integer key : map.keySet()) {
            System.out.println(key + " level:" + map.get(key).level + " parent:" + map.get(key).parent);
        }
 */
        return map.get(p).level == map.get(q).level && map.get(p).parent != map.get(q).parent;
    }

    public static void buildLevel(BinaryTreeNode<Integer> root, HashMap<Integer, NodeInfo> map, int i, int parent) {
        if (root == null) return;
        buildLevel(root.left, map, i + 1, root.data);
        map.put(root.data, new NodeInfo(i, parent));
        buildLevel(root.right, map, i + 1, root.data);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(7);
        System.out.println(isCousin(root, 2, 7));
    }
}
