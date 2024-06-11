// infix--> a+b/c*d-e
// prefix--> -+a*/bcde
// postfix--> abc/d*+e-
import java.util.Stack;

public class infixToPrefix {

    // Function to check if the given character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to check the precedence of operators
    static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to reverse a string
    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Function to convert an infix expression to a postfix expression
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and append from the stack until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            }
            // If the character is an operator
            else if (isOperator(c)) {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Function to convert an infix expression to a prefix expression
    static String infixToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = reverseString(infix);

        // Replace '(' with ')' and vice versa
        StringBuilder modifiedInfix = new StringBuilder();
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            if (c == '(') {
                modifiedInfix.append(')');
            } else if (c == ')') {
                modifiedInfix.append('(');
            } else {
                modifiedInfix.append(c);
            }
        }

        // Convert the modified infix expression to postfix
        String postfix = infixToPostfix(modifiedInfix.toString());

        // Reverse the postfix expression to get the prefix expression
        String prefix = reverseString(postfix);

        return prefix;
    }

    public static void main(String[] args) {
        String infix = "A+B/C*D-E";
        String prefix = infixToPrefix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + prefix);
    }
}
