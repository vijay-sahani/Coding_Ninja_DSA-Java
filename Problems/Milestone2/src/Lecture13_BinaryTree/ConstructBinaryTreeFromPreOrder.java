package Lecture13_BinaryTree;

public class ConstructBinaryTreeFromPreOrder {
    public static BinaryTreeNode<Integer> constructTreePreorder(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder, int inS, int inE, int preS, int preE) {
        if (inS > inE) return null;
        int rootData = preorder[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (inorder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        if (rootIndex == -1) return null;
        int leftInE = rootIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - inS + leftPreS;
        int rightInS = rootIndex + 1;
        int rightPreS = leftPreE + 1;

        root.left = buildTree(preorder, inorder, inS, leftInE, leftPreS, leftPreE);
        root.right = buildTree(preorder, inorder, rightInS, inE, rightPreS, preE);
        return root;
    }


    public static void main(String[] args) {
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        BinaryTreeNode<Integer> root = constructTreePreorder(preorder, inorder);

        PreOrderBinaryTree.preOrder(root);
    }
}
