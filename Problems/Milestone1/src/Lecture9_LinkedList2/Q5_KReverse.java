package Lecture9_LinkedList2;

public class Q5_KReverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        //Your code goes here
        LinkedListNode<Integer> curr = head;
        while (curr != null) {

            curr = curr.next;
        }
        return head;
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head, int start, int end) {
        LinkedListNode<Integer> prev = null;
        while (head != null && start != end) {
            LinkedListNode<Integer> temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
            start++;
        }
        return prev;
    }
}
