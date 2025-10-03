package InfinityChampionsProgram.Day6;

public class BackSpaceStirng_844 {
    public static void main(String[] args) {
        
    }

    public String StringAfterBackSpace(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // do nothing if stack is empty
            } else {
                stack.push(ch);
            }
            i++;
        }

        String ans = "";
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        // System.out.println(ans);
        return ans;
    }

    public boolean backspaceCompare(String s, String t) {
        String ans1 = StringAfterBackSpace(s);
        String ans2 = StringAfterBackSpace(t);
        return ans1.equals(ans2);
    }

}
