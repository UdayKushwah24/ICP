package InfinityChampionsProgram.Day9;

import java.util.*;
 
public class BasicCalculator_224 {
    public static int calculate(String s) {

        Stack<String> stack = new Stack<>();
        s = s.replaceAll(" ", "");
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];

            if (ch.equals(")")) {
                int n2 = Integer.parseInt(stack.pop());
                char sign = stack.pop().charAt(0);
                int n1 = Integer.parseInt(stack.pop());
                if (sign == '+') {
                    stack.push((n1 + n2) + "");
                } else if (sign == '-') {
                    stack.push((n1 - n2) + "");
                } else if (sign == '/') {
                    stack.push((n1 / n2) + "");

                } else if (sign == '*') {
                    stack.push((n1 * n2) + "");
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                }

            } else {
                stack.push(arr[i]);
            }
        }
        
        while (stack.size() > 1) {
            int n2 = Integer.parseInt(stack.pop());
            char sign = stack.pop().charAt(0);
            int n1 = Integer.parseInt(stack.pop());

            if (sign == '+')
                stack.push((n1 + n2) + "");
            else if (sign == '-')
                stack.push((n1 - n2) + "");
            else if (sign == '/')
                stack.push((n1 / n2) + "");
            else if (sign == '*')
                stack.push((n1 * n2) + "");
        }

        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        // String s = "1 + 1";
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}