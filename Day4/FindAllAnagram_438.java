package InfinityChampionsProgram.Day4;
import java.util.*;
public class FindAllAnagram_438 {
    public static boolean checkAnagram(String s1, String s2) {
        String id1 = Generate(s1);
        String id2 = Generate(s2);
        if (id1.equals(id2)) {
            return true;
        } else {
            return false;
        }
    }

    private static String Generate(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {

            sb.append('#');
            sb.append(freq[i]);

        } 
        return sb.toString();

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String str = s.substring(i, i + p.length());
            if (checkAnagram(str, p)) {
                ll.add(i);
            }
        }
        return ll;
    }
}