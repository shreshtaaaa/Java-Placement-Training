import java.util.Stack;

public class prefixToPostfix {

    // Function to check if the given character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to convert prefix to postfix
    static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Reverse the prefix expression
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();

        // Traverse the reversed prefix expression
        for (int i = 0; i < reversedPrefix.length(); i++) {
            char c = reversedPrefix.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            }
            // If the character is an operator
            else if (isOperator(c)) {
                // Pop two elements from the stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Concatenate them in the order (operand1 + operand2 + operator)
                String postfixExpression = operand1 + operand2 + c;

                // Push the resulting string back to the stack
                stack.push(postfixExpression);
            }
        }

        // The final element in the stack is the postfix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        String postfix = prefixToPostfix(prefix);
        System.out.println("Prefix: " + prefix);
        System.out.println("Postfix: " + postfix);
    }
}
