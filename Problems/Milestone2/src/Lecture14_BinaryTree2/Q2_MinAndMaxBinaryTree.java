package Lecture14_BinaryTree2;

/*
Minimum and Maximum in the Binary Tree
Send Feedback
For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
Return the output as an object of Pair class, which is already created.
Note:
All the node data will be unique and hence there will always exist a minimum and maximum node data.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints two integers denoting the minimum and the maximum data values respectively. A single line will separate them both.
Constraints:
2 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 14
Sample Input 2:
10 20 60 -1 -1 3 50 -1 -1 -1 -1
Sample Output 2:
3 60
 */

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class Q2_MinAndMaxBinaryTree {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        Pair<Integer, Integer> left = getMinAndMax(root.left);
        Pair<Integer, Integer> right = getMinAndMax(root.right);
        if (left.minimum > root.data) {
            left.minimum = root.data;
        } else if (right.minimum > root.data) {
            right.minimum = root.data;
        }
        if (left.maximum < root.data) {
            left.maximum = root.data;
        } else if (right.maximum < root.data) {
            right.maximum = root.data;
        }
        return new Pair<>(Math.min(left.minimum, right.minimum), Math.max(left.maximum, right.maximum));
    }
}