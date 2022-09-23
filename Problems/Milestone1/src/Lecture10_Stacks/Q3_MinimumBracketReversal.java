package Lecture10_Stacks;

import java.util.Stack;

public class Q3_MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        if ((input.length() & 1) == 1) return -1;
        for (int i = 0; i < input.length(); i++) {
            char exp = input.charAt(i);
            if (exp == '{') {
                stack.push(exp);
            } else if (exp == '}' && stack.isEmpty()) {
                stack.push(exp);
            } else if (exp == '}' && stack.peek() != '{') {
                stack.push(exp);
            } else {// Its already balanced
                stack.pop();
            }
        }
        int count = 0;
        while (!stack.isEmpty()) {
            char s1 = stack.pop();
            char s2 = stack.pop();
            if (s1 == s2) count++;
            else count += 2;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBracketReversals("}}{{"));
    }
}
