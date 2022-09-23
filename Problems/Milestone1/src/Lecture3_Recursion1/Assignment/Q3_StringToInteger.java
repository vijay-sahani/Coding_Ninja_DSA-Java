package Lecture3_Recursion1.Assignment;

/*

String to Integer
Send Feedback
Write a recursive function to convert a given string into the number it represents.
That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
 */
public class Q3_StringToInteger {
    public static int convertStringToInt(String input) {
        if (input.length() == 0) return 0;
        int digit = (input.charAt(0) - '0') * (int) Math.pow(10, input.length() - 1);
        return digit + convertStringToInt(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt("0"));
    }
}
