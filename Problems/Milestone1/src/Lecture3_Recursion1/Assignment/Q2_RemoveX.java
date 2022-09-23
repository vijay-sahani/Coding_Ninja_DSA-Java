package Lecture3_Recursion1.Assignment;

/*
Remove X
Send Feedback
Given a string, compute recursively a new string where all 'x' chars have been removed.
 */
public class Q2_RemoveX {
    public static String removeX(String input) {
        if (input.length() == 0) return input;// if input is empty we can say that we have checked every character
        if (input.startsWith("x")) { // if the input string is starting from "x" then i will remove and call for the elements
            return removeX(input.substring(1));
        }
        return input.charAt(0) + removeX(input.substring(1));// else store the first character and call for remaining characters
    }

    public static void main(String[] args) {
        System.out.println(removeX("xaxb"));
    }
}
