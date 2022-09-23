package Lecture13_BinaryTree;

public class ConstructBinaryTreeFromPostOrder {
    public static BinaryTreeNode<Integer> buildTree(int[] postorder, int[] inorder) {
        //Your code goes here
        return buildTree(postorder, inorder, 0, postorder.length - 1, 0, inorder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] post, int[] inorder, int posS, int posE, int inS, int inE) {
        if (inS > inE) {
            return null;
        }
        int rootData = post[posE];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (inorder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        if (rootIndex == -1) return null;

        int rightInS = rootIndex + 1;
        int rightInE = inE;
        int rightPosS = posE - 1 - (rightInE - rightInS);
        int rightPosE = posE - 1;
        int leftInS = inS;
        int leftInE = rootIndex - 1;
        int leftPosS = posS;
        int leftPosE = rightPosS - 1;
        root.right = buildTree(post, inorder, rightPosS, rightPosE, rightInS, rightInE);
        root.left = buildTree(post, inorder, leftPosS, leftPosE, leftInS, leftInE);
        return root;
    }

    public static void main(String[] args) {
        int[] post = {4, 5, 2, 6, 7, 3, 1};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = buildTree(post, inorder);
        PostOrderBinaryTree.postOrder(root);
    }
}
