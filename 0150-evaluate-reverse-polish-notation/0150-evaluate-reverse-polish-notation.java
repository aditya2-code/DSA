import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            // Fix 1: Use .equals() for string comparison instead of ==
            // Fix 3: Use if-else structures to avoid pushing operators as numbers
            if (token.equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } 
            else if (token.equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a); // Order matters: b is the left operand, a is the right operand
            } 
            else if (token.equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } 
            else if (token.equals("/")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b / a); // Order matters: b is the numerator, a is the denominator
            } 
            else {
                // Fix 2: If it's a numeric digit string, parse it to an Integer
                s.push(Integer.parseInt(token));
            }
        }
        
        // The final remaining element is the evaluation result
        return s.pop();
    }
}