package InfinityChampionsProgram.Day4;
import java.util.*;
public class LongestSubstringRepeatchar_3 {
 
    /* public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<Character>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    } */

    public static int lengthOfLongestSubstring(String str) {
        int s = 0,   e = 0,   max = 0;
        HashSet<Character> set = new HashSet<>();
        while (e < str.length()) {
            if (!set.contains(str.charAt(e))) {
                set.add(str.charAt(e));
                max = Math.max(e-s + 1, max);
                e++;
            } else {
                set.remove(str.charAt(s));
                s++;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}