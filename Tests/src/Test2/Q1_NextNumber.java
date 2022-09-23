/*
Next Number
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0
 */
package Test2;

/*
Next Number
Send Feedback
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0
 */

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Q1_NextNumber {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

        head = reverseLL(head);
        LinkedListNode<Integer> curr = head.next, prev = null;
        int carry = 1;
        while (carry > 0 || curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            curr = curr.next;
            carry = sum / 10;
            prev.next = new LinkedListNode<>(carry % 10);
        }
        return reverseLL(head);
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null, curr = head;
        while (curr != null) {
            LinkedListNode<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = new LinkedListNode<>(9);
        head.next = new LinkedListNode<>(9);
        head.next.next = new LinkedListNode<>(9);
        head.next.next.next = new LinkedListNode<>(9);
        head.next.next.next.next = new LinkedListNode<>(-1);

        print(head);
        head = nextLargeNumber(head);
        print(head);
    }
}
