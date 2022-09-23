package Lecture9_LinkedList2;

public class Q4_SwapNodeLL {
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        //Your code goes here
        LinkedListNode<Integer> curr=head;
        int si=0;
        LinkedListNode <Integer> first=null,second=null;
        while(curr!=null && (first==null || second==null)){
            if (si==i){
                first=curr;
            }
            if (si==j){
                second=curr;
            }
            curr=curr.next;
            si++;
        }
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        return head;
    }
}
