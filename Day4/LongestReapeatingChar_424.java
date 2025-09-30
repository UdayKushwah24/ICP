package InfinityChampionsProgram.Day4;

public class LongestReapeatingChar_424 {
    
    public static int KartikBhaiyaAndString(int k, String str, char ch) {
        int si = 0, ei = 0, ans = 0, flip = 0;
        while (ei < str.length()) {
            // grow
            if (str.charAt(ei) != ch) {
                flip++;
            }
            // shrink
            while (flip > k && si <= ei) {
                if (str.charAt(si) != ch) {
                    flip--;
                }
                si++;
            }

            // ans update
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }

    public static int characterReplacement(String str, int k) {
        int ans = 0;
        // for (int i = 0; i < str.length(); i++) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            int flipch = KartikBhaiyaAndString(k, str, ch);
            ans = Math.max(ans, flipch);

        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "ABABAB";
        int k = 2;
        System.out.println(characterReplacement(s, 2));
    }
}
