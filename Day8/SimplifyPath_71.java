package InfinityChampionsProgram.Day8;


import java.util.*;
public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        return SimplifyPath(path.substring(1));
    }

    public String SimplifyPath(String path) {
        String[] arr = path.split("\\/+");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (!stack.isEmpty() && arr[i].equals("..")) {
                stack.pop();
            } else {
                if (!arr[i].equals(".")) {
                    stack.push(arr[i]);
                }
            }

        }
        System.out.println(stack);
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {

            ans.insert(0, ("/" + stack.pop()));

        }
        return ans.toString();
    }
}
