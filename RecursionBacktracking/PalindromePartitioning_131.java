package InfinityChampionsProgram.RecursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        helper(list, s,  new ArrayList<>());
        return list;

    }

    private static void helper(List<List<String>> list, String s,   List<String> ll) {
        if (s.length() == 0) {
            list.add(new ArrayList<>(ll));
            return;
        }

        for (int cut = 1; cut <= s.length(); cut++) {
            String str = s.substring(0, cut);
            if (isPalindrome(str)) {
                
                ll.add(str );
                helper(list, s.substring(cut),  ll);
                ll.remove(ll.size() - 1);
            }
        }
    }

     public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
