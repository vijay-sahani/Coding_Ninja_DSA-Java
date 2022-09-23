package Lecture10_Stacks;

/*
Code : Balanced Parenthesis
Send Feedback
For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
Example:
Expression: (()())
Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
You need to return a boolean value indicating whether the expression is balanced or not.
Note:
The input expression will not contain spaces in between.
Input Format:
The first and the only line of input contains a string expression without any spaces in between.
 Output Format:
The only line of output prints 'true' or 'false'.
Note:
You don't have to print anything explicitly. It has been taken care of. Just implement the function.
Constraints:
1 <= N <= 10^7
 Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1 :
(()()())
Sample Output 1 :
true
Sample Input 2 :
()()(()
Sample Output 2 :
false
Explanation to Sample Input 2:
The initial two pairs of brackets are balanced. But when you see, the opening bracket at the fourth index doesn't have its corresponding closing bracket which makes it imbalanced and in turn, making the whole expression imbalanced. Hence the output prints 'false'.
 */
public class BalancedParenthesis {
    static char[] stack;
    static int top = -1;

    public static boolean isBalanced(String expression) {
        //Your code goes here
        int n = expression.length();
        stack = new char[n >> 1]; // create a stack of half size of expression because we are only storing the opening braces
        for (int i = 0; i < n; i++) {
            char exp = expression.charAt(i);
            if (exp == '(' && top + 1 < stack.length) {
                stack[++top] = exp;
            } else if (exp == ')') {
                if (top == -1)
                    return false; // if the stack is empty means there is no opening bracket for a closing bracket
                top--; // keep going
            } else return false;// stack is full,Thus we can say that for every opening there is no closing bracket
        }
        return top == -1; // if the top is -1 that means there was a closing bracket for every opening bracket
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
    }
}
