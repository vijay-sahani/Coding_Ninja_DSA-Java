package Lecture10_Stacks;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class Stack {

    //Define the data members
    private Node head,tail;
    public Stack() {
        //Implement the Constructor
        this.head=null;
        this.tail=null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        Node curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return head==null;
    }

    public void push(int element) {
        //Implement the push(element) function
        if (head==null){
            head=new Node(element);
            tail=head;
            return ;
        }
        tail.next=new Node(element);
        tail=tail.next;
    }

    public int pop() {
        //Implement the pop() function
        if (head==null)return -1;
        if (head==tail){
            int item=head.data;
            head=null;
            tail=null;
            return item;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        int item=curr.next.data;
        curr.next=null;
        tail=curr;
        return item;
    }

    public int top() {
        //Implement the top() function
        if(head!=null)return tail.data;
        return -1;
    }
}