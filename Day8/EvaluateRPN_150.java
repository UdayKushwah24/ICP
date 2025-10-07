package InfinityChampionsProgram.Day8;


import java.util.*;
public class EvaluateRPN_150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!stack.isEmpty() && (s.equals("-") || s.equals("/") || s.equals("+") || s.equals("*"))) {
                int top = stack.pop();
                int prev = stack.pop();
                int operator = (int) (s.charAt(0));
                System.out.println(operator);
                if (operator == 43) {
                    stack.push(top + prev);
                } else if (operator == 45) {
                    stack.push(prev - top);

                } else if (operator == 42) {
                    stack.push(top * prev);
                } else if (operator == 47) {
                    stack.push(prev / top);
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        // System.out.println(stack);
        return stack.pop();
    }
}
