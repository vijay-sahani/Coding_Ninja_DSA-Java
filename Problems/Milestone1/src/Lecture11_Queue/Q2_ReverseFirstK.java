package Lecture11_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2_ReverseFirstK {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(input.poll());
        }
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }
        while (!input.isEmpty()) q.offer(input.poll());
        return q;
    }

}
