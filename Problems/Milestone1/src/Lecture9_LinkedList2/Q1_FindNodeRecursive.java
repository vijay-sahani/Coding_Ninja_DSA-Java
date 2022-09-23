package Lecture9_LinkedList2;

public class Q1_FindNodeRecursive {
    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        return findNodeRec(head,n,0);
    }
    public static int findNodeRec(LinkedListNode<Integer> head, int n,int i) {
        if (head==null)return -1;
        if (head.data==n)return i;
        return findNodeRec(head.next,n,i+1);
    }
}
