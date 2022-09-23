package Lecture8_LinkedList1;

public class Q3_PrintReverseLL {

    public static void printReverse(LinkedListNode<Integer> root) {
        //Your code goes here
        LinkedListNode<Integer> curr=root,prev=null;
        while(curr!=null){
            LinkedListNode<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        print(prev);
    }
    public static void print(LinkedListNode<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

}
