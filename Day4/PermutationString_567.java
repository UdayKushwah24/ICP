package InfinityChampionsProgram.Day4;

public class PermutationString_567 {


    public static String generateKey(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
             
                sb.append(arr[i]);
                sb.append("#");
            
        }
        return sb.toString();
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        String k1 = generateKey(s1);
        System.out.println(k1);
        for (int i = 0; i < Math.abs(s2.length() - s1.length())+1; i++) {
             
            String str = s2.substring(i, i + s1.length());
            System.out.println(str);
            String k2 = generateKey(str);
            System.out.println(k2);
            if (k1.equals(k2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
