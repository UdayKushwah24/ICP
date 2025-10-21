package InfinityChampionsProgram.Day10;
import java.util.*;
public class DecodeString_394 {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String temp = "";
                while (!stack.peek().equals("[")) {
                    temp = stack.pop() + temp;

                }
                stack.pop();
                // int num = 0;
                String numString = "";
                while (!stack.isEmpty() && stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9') {
                    numString = stack.pop() + numString;
                }
                int num = Integer.parseInt(numString);
                String repeat = temp.repeat(num);
                stack.add(repeat);

            } else {
                stack.push(s.charAt(i) + "");
            }

        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        return ans;
    }
}
