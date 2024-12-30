import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        // Split the expression into tokens (operands and operators)
        String[] tokens = expression.split(" ");
        
        for (String token : tokens) {
            // If the token is a number, push it to the stack
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } 
            // If the token is an operator, pop two elements from the stack, apply the operator, and push the result back
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator(operand1, operand2, token);
                stack.push(result);
            }
        }
        
        // The result will be the only element left in the stack
        return stack.pop();
    }

    // Helper method to check if a string is a number
    public static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper method to apply an operator on two operands
    public static int applyOperator(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a postfix expression
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();
        
        // Evaluate the expression
        try {
            int result = evaluatePostfix(expression);
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Error evaluating expression: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}