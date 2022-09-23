package Lecture8_LinkedList1;

public class Q5_PalindromeLL {
    private static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> mid = midPoint(curr);
        LinkedListNode<Integer> lst = reverseLL(mid.next);
        mid.next = null;
        while (head != null && null != lst) {
            if (!head.data.equals(lst.data)) return false;
            head = head.next;
            lst = lst.next;
        }
        return true;
    }

    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        while (head != null) {
            LinkedListNode<Integer> temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
