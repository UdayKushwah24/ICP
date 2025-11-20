package InfinityChampionsProgram.Day13;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        String ans = "";
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                ans += (char) (i + 97);
            }
        }
        return ans;
    }
}
